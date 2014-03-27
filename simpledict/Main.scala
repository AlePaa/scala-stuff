import scala.io.Source

object Main {

  def main(args: Array[String]): Unit = {
      val dict: Map[String, String] = buildDictionary(args(0))
      println("Finished learning the words! An empty query terminates the program")
      var isRunning: Boolean = true
      while (isRunning) {
        var input: String = readLine()
        if (input.isEmpty) { isRunning = false }
        else {
          if (dict isDefinedAt input) { println(dict(input)) }
          else { println("ERROR! I don't know the word " + input) }
        }
      }
      println("Terminated")
  }
  
  def buildDictionary(filename: String): Map[String, String] = {
    var dict: Map[String, String] = Map()
    var keyWord: String = ""
    var lineCount: Int = 1
    for (line <- Source.fromFile(filename).getLines) {
      if (lineCount % 2 == 0) { dict += (keyWord -> line) }
      else { keyWord = line }
      lineCount = lineCount + 1
    }
    dict
  }
}
