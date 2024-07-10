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

  // В Scala мы можем задавать дефолтные значения для параметров, что позволит нам лишний
  // раз не указывать параметры при вызове функции. Только следите за порядком аргументов.
  def aFunctionWithDefaultParametr(x: Integer, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }
  println(aFunctionWithDefaultParametr(5))  // "x = 5 and y = Default Parameter"

  // Вызов функции по имени(call-by-name)(=>) vs Вызов по значению(call-by-value):

  // Вызов по значению подразумевает вычисление значения переданного выражения перед вызовом функции.
  // Преимущество: значение вычисляется только один раз
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")  // call by value: x1 = 1626916156573400
    println(s"call by value: x2 = $x")  // call by value: x2 = 1626916156573400
  }

  // Вызов по имени подразумевает вычисление значения выражения в момент его вызова в функции
  // Преимущество: значение не вычисляется, если не используется в теле функции
  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")  // call by name: x1 = 1626916157878600
    println(s"call by name: x2 = $x")  // call by name: x2 = 1626916157933800
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  //вложенные функции - это возможность определить функцию или даже несколько функций
  // внутри одной функции и там же ее(или их) вызвать
  def aBossFunction(): String = {
    def aHelperFunction(): String = "I'm here to help"

    aHelperFunction()
  }
  println(aBossFunction())  // I'm here to help
}















