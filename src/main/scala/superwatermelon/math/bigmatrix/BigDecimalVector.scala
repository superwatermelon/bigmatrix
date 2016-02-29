/*
 * Copyright © 2016 Superwatermelon Limited.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package superwatermelon.math.bigmatrix

/**
  *
  * @param values
  */
class BigDecimalVector(val values: Seq[BigDecimal]) {

  /**
    *
    * @param other
    * @return
    */
  def dot(other: BigDecimalVector): BigDecimal =
    ((values zip other.values) map Function.tupled (_ * _)).sum

  /**
    *
    * @param other
    * @return
    */
  def ∙(other:BigDecimalVector): BigDecimal = dot(other)

  /**
    *
    * @return
    */
  def transpose: BigDecimalVector = BigDecimalVector(values)

  /**
    *
    * @return
    */
  def ᵀ: BigDecimalVector = transpose

  /**
    *
    * @return
    */
  override def hashCode = values.hashCode()

  /**
    *
    * @param other
    * @return
    */
  override def equals(other: Any) = other match {
    case that: BigDecimalVector =>
      this.values == that.values
    case _ =>
      false
  }

}

object BigDecimalVector {

  /**
    *
    * @param values
    * @return
    */
  def apply(values: Seq[BigDecimal]): BigDecimalVector =
    new BigDecimalVector(values)

}
