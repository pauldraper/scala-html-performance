package htmlperf

import scalatags.Text.all.{html => htmlTag, _}

object ScalaTags {

  def render(title: String, paragraph: String, n: Int) =
    htmlTag(
      head(
        script("console.log(1)")
      ),
      body(
        h1(color := "red")(title),
        div(backgroundColor := "blue")(
          p(`class` := "content first", paragraph),
          a(href := "http://example.com")("Example"),
          (0 until n).map { i =>
            p(i,
              `class` := "content",
              color := (if (i % 2 == 0) "red" else "green"),
              "Paragraph ",
              i
            )
          }
        )
      )
    )
}
