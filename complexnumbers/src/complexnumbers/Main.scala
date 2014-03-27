
package complexnumbers

object Main {

  def main(args: Array[String]): Unit = {
    val luQ1: Gomblex = new Gomblex(1, -2)
    println(luQ1.toString)
    val luQ2: Gomblex = new Gomblex(2, 3)
    println(luQ2.toString)
    val luQ3: Gomblex = new Gomblex(3, 4)
    println(luQ3.toString)
    val luQ4: Gomblex = luQ1 + luQ2
    val luQ5: Gomblex = luQ1 - luQ2
    println(luQ4.toString)
    println(luQ5.toString)
  }

}
