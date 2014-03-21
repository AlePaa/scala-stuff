
package guessinggame

object Main {

  def main(args: Array[String]): Unit = {
    var points = 0
    var play = 1
    while (play == 1) {
      val number = Math.round((10 * math.random)).toInt
      points = points + countPoints(number, getGuesses)

      println("The correct answer was: " + number)
      println("You have " + checkBalance(points) + " a total of " + points + " cybereuros")

      println("Keep going? Typing 'n' will end the game: ")
      if (Console.readLine == "n") { play = 0 }
    }
    println("Bye!")
  }

  def checkBalance(points: Int): String = {
    if (points < 0) { "lost" }
    else { "won" }
  }

  def countPoints(number: Int, guesses: Array[Int]): Int = {
    var points = 0
    var value = 400
    for (guess <- guesses) {
      if (guess == number) { points = points + value }
      value = value / 2
    }
    if (points == 0) { points = points - 100 }
    points
  }

  def getGuesses(): Array[Int] = {
    println("Enter 3 guesses between 0 and 9 ")
    var array: Array[Int] = new Array[Int](3)
    for (i <- 0 to 2) {
      println("Guess nr. " + (i + 1) + ":")
      array(i) = Console.readInt
    }
    array
  }
}
