
package alphabeticparameters

object Main {

  def main(args: Array[String]): Unit = {
    args.sortWith((e1, e2) => (e1 compareTo e2) < 0)
    args foreach println
  }
}
