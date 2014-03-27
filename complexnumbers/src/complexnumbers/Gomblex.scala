
package complexnumbers

case class Gomblex(val real: Double, val imag: Double) {

  def this(real: Double) = this(real, 0)

  private def exp(num: Double): Double = { num * num }

  def unary_+ = this
  def unary_- = new Gomblex(-real, -imag)

  def inv() = new Gomblex((real / (exp(real) + exp(imag))),
    (-imag / (exp(real) + exp(imag))))
  def +(other: Gomblex) = new Gomblex(real + other.real, imag + other.imag)
  def -(other: Gomblex) = this + -other
  def *(other: Gomblex) = new Gomblex(real * other.real - imag * other.imag,
    real * other.imag + imag * other.real)
  def div(other: Gomblex) = this * other.inv

  override def toString(): String = {
    this match {
      case Gomblex.i        => "i"
      case Gomblex(real, 0) => real.toString
      case Gomblex(0, imag) => imag.toString + "*i"
      case _                => fullString
    }
  }
  def fullString(): String = { real + (if (imag < 0) "-" + -imag else "+" + imag) + "*i" }
}

object Gomblex {
  val i = new Gomblex(0, 1)
  def Gomblex(real: Double) = new Gomblex(real)
}
