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

object Implicits {

  /**
    *
    * @param values
    * @return
    */
  implicit def toBigDecimalVector(values: Seq[BigDecimal]): BigDecimalVector =
    BigDecimalVector(values)

  /**
    *
    * @param vector
    * @return
    */
  implicit def fromBigDecimalVector(vector: BigDecimalVector): Seq[BigDecimal] =
    vector.values

  /**
    *
    * @param values
    * @return
    */
  implicit def toBigDecimalMatrix(values: Seq[Seq[BigDecimal]]): BigDecimalMatrix =
    BigDecimalMatrix(values.map(toBigDecimalVector))

  /**
    *
    * @param matrix
    * @return
    */
  implicit def fromBigDecimalMatrix(matrix: BigDecimalMatrix): Seq[Seq[BigDecimal]] =
    matrix.values.map(fromBigDecimalVector)

  /**
    *
    * @param values
    * @return
    */
  implicit def toBigDecimalMatrixFromVectorSeq(values: Seq[BigDecimalVector]): BigDecimalMatrix =
    BigDecimalMatrix(values)

  /**
    *
    * @param matrix
    * @return
    */
  implicit def fromBigDecimalMatrixToVectorSeq(matrix: BigDecimalMatrix): Seq[BigDecimalVector] =
    matrix.values

  /**
    *
    * @param values
    * @return
    */
  implicit def toBigDecimalMatrixFromVector(values: BigDecimalVector): BigDecimalMatrix =
    BigDecimalMatrix(Seq(values))

  /**
    *
    * @param matrix
    * @return
    */
  implicit def fromBigDecimalMatrixToVector(matrix: BigDecimalMatrix): BigDecimalVector =
    matrix.values.head

}
