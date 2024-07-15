package Lessons.Week1Basics

object Expressions extends App {
  // Выражения(Expressions) и Инструкции (Instructions)
  val aVal: Int = 1 + 2 * 3
  println(aVal)  // 7
  println(1+2*3)  // 7

//  Для ознакомления приведем список того, что применяется в Scala-выражениях:
//
//      + - / *
//      & | ^ << >> >>>
//      == != > >= <= < ! && ||

  val aCondition: Boolean = true
  val ifExpressionValue: String = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue)  // True Condition

  val someVal: Unit = print("Someval")
  println(someVal)  // Someval()

  // Блок кода (Code block)
  val aCodeBlock: Boolean = {
    val someVal: Int = 1
    val y: Int = 2

    if (someVal + y > 1) true else false  // тип данных блока определяется по последнему выражению
  }
  println(aCodeBlock)  // true

}




















