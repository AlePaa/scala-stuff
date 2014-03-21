
package leapyears

object Main {

  def main(args: Array[String]): Unit = {
    println("This program prints all the leap years between two given dates")
    println("Enter first year: ")
    var dateA = Console.readInt
    println("Enter second year: ")
    var dateB = Console.readInt
    println()
    if (dateA > dateB) {
      checkYearsDescending(dateA, dateB)
    } else {
      checkYearsAscending(dateA, dateB)
    }
  }

  def checkYearsAscending(x: Int, y: Int) {
    var i = x
    while (i <= y) {
      printIfLeapyear(i)
      i = i + 1
    }
  }

  def checkYearsDescending(x: Int, y: Int) {
    var i = x
    while (i >= y) {
      printIfLeapyear(i)
      i = i - 1
    }
  }

  def printIfLeapyear(x: Int) {
    if (x % 4 == 0 && (x % 400 == 0 || x % 100 != 0) && x != 4000) {
      println(x)
    }
  }
}
