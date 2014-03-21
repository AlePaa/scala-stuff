
package starprinter

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter pyramid height: ")
    var x = Console.readInt
    printPyramid(x)
  }

  /**
   * @param x the height of the pyramid
   */
  def printPyramid(x: Int) = {
    var i = 0
    while (i <= x) {
      printSpaces(x, i)
      printStars(i)
      i = i + 1
    }
  }

  /*
   * @param x the height of the pyramid
   * @param y the number of the current level
   */
  def printSpaces(x: Int, y: Int) {
    var i = 0;
    while (i < x - y) {
      print(" ")
      i = i + 1
    }
  }

  /*
   * @param x the number of the current level
   */
  def printStars(x: Int) {
    var i = 0;
    while (i < x * 2 - 1) {
      print("*")
      i = i + 1
    }
    println("");
  }
}