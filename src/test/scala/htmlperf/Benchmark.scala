package htmlperf

import org.scalameter.Gen
import org.scalameter.api.Bench
import org.scalameter.picklers.Implicits._
import org.scalameter.picklers.Pickler
import org.scalameter.api.exec

object Benchmark extends Bench.ForkedTime {
  private[this] object Templater extends Enumeration {
    val ScalaTags = Value
    val Twirl = Value

    implicit val pickler = new Pickler[Value] {
      def pickle(value: Value) = implicitly[Pickler[Int]].pickle(value.id)
      def unpickle(bytes: Array[Byte], start: Int) = {
        val (value, end) = implicitly[Pickler[Int]].unpickle(bytes, start)
        apply(value) -> end
      }
    }
  }

  private[this] val genN = Gen.exponential("n")(2, 200, 10)
  private[this] val genTemplater = new GenEnumeration("templater")(Templater.values.toSeq: _*)

  performance of "templating" in {
    using(Gen.crossProduct(genN, genTemplater)).config(exec.benchRuns -> 100, exec.warmupCovThreshold -> 0.05) in {
      case (n, Templater.ScalaTags) => ScalaTags.render("title", "paragraph", n)
      case (n, Templater.Twirl) => html.twirl("title", "paragraph", n)
    }
  }

}
