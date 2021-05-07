# LearningScala

## Evaluantion

- Call by value
"In call by value, the argument expression is evaluated, and the resulting value is bound to the corresponding variable in the function " [Wikipedia](https://en.wikipedia.org/wiki/Evaluation_strategy#Call_by_value)
- Call by name
"Call by name is an evaluation strategy where the arguments to a function are not evaluated before the function is called" [Wikipedia](https://en.wikipedia.org/wiki/Evaluation_strategy#Call_by_name)

## Functions

### Higher order functions

"Higher order functions take other functions as parameters or return a function as a result." [Higher-order Functions](https://docs.scala-lang.org/tour/higher-order-functions.html)

### [Nested functions](https://docs.scala-lang.org/tour/nested-functions.html)
 ```scala
def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }  
    fact(x, 1)
 }

 println("Factorial of 2: " + factorial(2))
 println("Factorial of 3: " + factorial(3))
```

### Anonymous functions

"[...] anonymous function is also known as a function literal. A function which does not contain a name is known as an anonymous function. An anonymous function provides a lightweight function definition. It is useful when we want to create an inline function." [Anonymous Functions in Scala](https://www.geeksforgeeks.org/anonymous-functions-in-scala/)

 ```scala
(z:Int, y:Int)=> z*y
// Or
(_:Int)*(_Int)
```
