import scala.annotation.tailrec

def sqrt(x : Double): Double = {
  def isGoodEnough(guess: Double, x: Double) =
    math.abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  @tailrec
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  sqrtIter(guess = 1.0, x = x)
}
