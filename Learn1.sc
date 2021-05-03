import scala.annotation.tailrec

def isGoodEnough(guess: Double, x: Double) =
  math.abs(guess * guess - x ) < 0.001

def improve(guess: Double, x: Double) =
  (guess + x /guess)/2

@tailrec
def sqrtIter(guess : Double, x : Double) : Double =
  if(isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess,x),x)

def sqrt(x : Double): Double = sqrtIter(guess = 1.0, x = x)

sqrt(2)
