
package simpleclock

object Main {

  def main(args: Array[String]): Unit = {
    val clock = new SecondCounter()
    for (i <- 0 until 400) { clock.incSecond; println(clock.toString) }
  }
}