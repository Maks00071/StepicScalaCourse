package Lessons.Week2OOP.ClassesOOP

object TaskButton extends App {


  class Button(label: String) {

    def this() = this("test")

    def click(): String = {
      s"button -$label- has been clicked"
    }
  }

  class RoundedButton(label: String) extends Button(label) {
    override def click(): String = s"rounded button -${label}- has been clicked"
  }
}
