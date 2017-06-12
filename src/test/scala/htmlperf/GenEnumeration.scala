package htmlperf

import org.scalameter.picklers.Pickler
import org.scalameter.{Gen, Parameter, Parameters}

/**
 * [[Gen.enumeration]] only warms the last value
 */
class GenEnumeration[T : Pickler](axis: String)(values: T*) extends Gen[T] {
  def dataset = values.iterator.map(x => Parameters(Parameter[T](axis) -> x))
  def warmupset = values.iterator
  def generate(params: Parameters) = params[T](axis)
}
