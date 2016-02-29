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
import superwatermelon.math.bigmatrix._

class BigDecimalVectorTest extends FunSpec {

  describe("BigDecimalVector") {

    describe("Dot product: dot, ∙") {

      it("Calculates the dot product of two vectors") {

        import superwatermelon.math.bigmatrix.Implicits._

        val a = Seq(
          BigDecimal("0.2"),
          BigDecimal("0.3"),
          BigDecimal("0.4")
        )
        val b = Seq(
          BigDecimal("0.2"),
          BigDecimal("0.5"),
          BigDecimal("0.8")
        )

        assert((a ∙ b) == BigDecimal("0.51"))

      }

      it("Retains precision by using BigDecimal") {

        import superwatermelon.math.bigmatrix.Implicits._

        val a = Seq(
          BigDecimal("0.2"),
          BigDecimal("0.5"),
          BigDecimal("0.0")
        )
        val b = Seq(
          BigDecimal("0.5"),
          BigDecimal("0.4"),
          BigDecimal("0.3")
        )

        assert((a ∙ b) == BigDecimal("0.3")) // Would normally have a rounding error using a double

      }

    }

    describe("Transpose: transpose, ᵀ") {

      import superwatermelon.math.bigmatrix.Implicits._

      it("Doesn't do anything to a Vector") {

        val a = Seq(
          BigDecimal("5.0"),
          BigDecimal("15.0")
        )

        assert(a.ᵀ == BigDecimalVector("5.0", "15.0"))

      }

    }

    describe("Multiply: multiply, *") {

      it("Performs element-wise multiplication with a vector") {

        val a = BigDecimalVector("0.2", "0.5", "2.0")
        val b = BigDecimalVector("0.5", "0.4", "0.1")

        assert(a * b == BigDecimalVector("0.1", "0.2", "0.2"))

      }

      it("Performs element-wise multiplication with a scalar") {

        val a = BigDecimalVector("0.2", "0.5", "2.0")
        val b = BigDecimal("0.5")

        assert(a * b == BigDecimalVector("0.1", "0.25", "1.0"))

      }

    }

  }

}
