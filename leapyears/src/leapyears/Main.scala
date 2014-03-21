
package leapyears

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter first year: ")
    val a = readInt
    println("Enter second year: ")
    val b = readInt
    println()
    for (i <- (a to b) by (if (b > a) 1 else -1)) printIfLeapyear(i)
  }

  def printIfLeapyear(x: Int) {
    if (x % 4 == 0 && (x % 400 == 0 || x % 100 != 0) && x != 4000) println(x)
  }
}
