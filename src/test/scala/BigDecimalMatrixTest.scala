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

import org.scalatest.FunSpec
import superwatermelon.math.bigmatrix.{BigDecimalVector, BigDecimalMatrix}

class BigDecimalMatrixTest extends FunSpec {

  import superwatermelon.math.bigmatrix.Implicits._

  describe("BigDecimalMatrix") {

    it("Can be created from a Seq of Seqs of BigDecimals") {

      val matrix: BigDecimalMatrix = Seq(
        Seq(
          BigDecimal("12.0"),
          BigDecimal("0.4")
        ),
        Seq(
          BigDecimal("29.3"),
          BigDecimal("123.76")
        )
      )

      assert(matrix.isInstanceOf[BigDecimalMatrix])

    }

    it("Can also be created from a Seq of BigDecimalVectors") {

      val matrix: BigDecimalMatrix = Seq(
        BigDecimalVector(Seq(
          BigDecimal("42.3"),
          BigDecimal("23.5")
        )),
        BigDecimalVector(Seq(
          BigDecimal("321.53"),
          BigDecimal("230.12")
        ))
      )

      assert(matrix.isInstanceOf[BigDecimalMatrix])

    }

  }

}
