fun main() {
  //helloWorld()

  //println("A soma de 10 e 5 é ${sum(10, 5)}")
  println(divisao(10f, 3.5f))
}

fun sum2 (a: Int, b: Int) = (a + b) //função de uma única linha

fun sum (a: Int, b: Int): Int {
  return (a + b)
}

fun helloWorld() = println("Hello, world!")

fun divisao (a: Float, b: Float): Float = a / b