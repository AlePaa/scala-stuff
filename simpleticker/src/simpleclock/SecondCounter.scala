
package simpleclock

class SecondCounter {
  private var sec = 0
  private var min = 0
  private var hour = 0

  def SecondCounter() = new SecondCounter()
  private def getSec(): Int = sec
  private def getMin(): Int = min
  private def getHour(): Int = hour
  def incSecond() {
    sec = sec + 1
    if (sec > 59) { sec = 0; min = min + 1 }
    if (min > 59) { min = 0; hour = hour + 1 }
    if (hour > 59) { hour = 0 }
  }
  override def toString(): String = getHour() + ":" + getMin() + ":" + getSec()
}
