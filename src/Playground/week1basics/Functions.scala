package Playground.week1basics

object Functions extends App {
  // функции
  def aPerson(name: String, surName: String): String = {
  s"$name $surName"
  }

  // можно печать сделать и в функции, но тип данных должен быть Unit (void)
  def aPersonTwo(name: String, surName: String): Unit = {
    println(s"$name $surName")
  }

  println(aPerson("John", "Smith"))  // John Smith
  aPersonTwo("John", "Smith")  // John Smith
}
