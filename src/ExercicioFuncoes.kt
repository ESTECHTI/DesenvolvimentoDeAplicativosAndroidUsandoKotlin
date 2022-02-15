fun main() {
  println(meses(2))
  println(dias(2))
  println(horas(2))
  println(minutos(2))
  println(segundos(2))
  println(text("Olá mundo"))
  println(cubo(3))
  println(miles(10f))
  println(changeLetters("Testando a funcionando"))
}

fun meses(a: Int): Int {
  val meses12: Byte = 12
  return (a * meses12)
}

fun dias(a: Int): Int {
  val diasAno: Int = 365
  return (a * diasAno)
}

fun horas(a: Int): Int {
  val horasAno: Int = 24
  val diasAno: Int = 365
  return(a * (24 * 365))
}

fun minutos(a: Int): Int {
  val minutos: Int = 60
  val horasDia: Int = 24
  val horasDias: Int = (minutos * horasDia)
  val diasAno: Int = 365
  return (a * (horasDias * diasAno))
}

fun segundos(a: Int): Int {
  val segundos: Int = 60
  val minutos: Int = 60
  val segMin: Int = (segundos * minutos)
  val horasDia: Int = 24
  val segDia: Int = (segMin * horasDia)
  val diasAno: Int = 365
  return (a * (segDia * diasAno))
}

fun text(a: String): Int = a.length

fun cubo(a: Int): Int = a * a * a

fun miles(a: Float):Float = a * 1.6f

fun changeLetters(a: String): String {
  val str: String = a.replace("a", "x").lowercase()
  return (str)
}

