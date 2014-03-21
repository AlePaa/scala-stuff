

package stringsearcher

import scala.io.Source

object Main {

  def main(args: Array[String]): Unit = {

    val file = Console.readLine

    var loop = true
    while (loop) {
      val keyword = Console.readLine
      if (keyword.isEmpty) { loop = false }
      else { x(file, keyword) }
    }
  }

  def x(filename: String, keyword: String) {
    var linecount = 0
    for (line <- Source.fromFile(filename).getLines) {
      if (line.contains(keyword)) {
        println(linecount + ": " + line)
      }
      linecount = linecount + 1
    }
  }
}