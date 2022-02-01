import scala.annotation.tailrec

def sqrt(x : Double): Double = {
  @tailrec
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    math.abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  sqrtIter(guess = 1.0)
}

sqrt(2)
