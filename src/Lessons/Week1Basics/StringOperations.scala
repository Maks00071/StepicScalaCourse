package Lessons.Week1Basics

object StringOperations extends App {
  // операции со строками
  val aString: String = "Hello, World!"

  println(aString.length)  // 13
  println(aString.charAt(1))  // 'e'
  println(aString.substring(0, 2))  // "He"
  println(aString.split(" ").toList)  // List(Hello,, World!)
  println(aString.startsWith("He"))  // true
  println(aString.replace("!", "."))  // "Hello, World."
  println(aString.toLowerCase())  // "hello, world!"
  println(aString.toUpperCase())  // "HELLO, WORLD!"
  println(aString.reverse)  // "!dlroW ,olleH"
  println("abcd".take(2))  // "ab"
  println(aString.take(5).toUpperCase())  // "HELLO"
  println(aString.replace("o", "T"))  // "HellT, WTrld!"

  // преобразование строки в число и обратно
  val aNumber: String = "42"
  println(aNumber.toInt)  // 42
  println(aNumber.getClass)  // class java.lang.String

  val aStringToNumber: Int = aNumber.toInt
  println(aStringToNumber)  // 42
  println(aStringToNumber.getClass)  // int

  val aNumberToString: String = aStringToNumber.toString
  println(aNumberToString)  // "42"
  println(aNumberToString.getClass)  // class java.lang.String

  // добавление в начало и в конец строки
  /*
  Вещи, на которые стоит обратить внимание:
  1. добавление в начало подразумевает наличие двоеточия после плюса.
     Соответственно, добавление в конец - перед плюсом
  2. +: или :+ подразумевает, что присоединять будем одиночные элементы (работаем с типом "char")
  3. ++ или :++ указывает, что присоединять будем несколько элементов (используем элементы типа "String"),
     следовательно здесь уже понадобятся двойные кавычки
  4. внимание на типы, с которыми работаем: в нашем случае присоединения всегда происходит
     к элементам типа String (в примере это "42" и "bc")
   */
  println('1' +: "42" :+ '3')  // "1423"
  println('a' +: "bc" :+ 'd')  // "abcd"
  println("a" ++ "bc" ++ "d")  // "abcd"
//  println('a' +: 'b')  - так нельзя!

  //интерполяция строк - Интерполяция применяется, когда в строку необходимо подставить какое-то значение переменной:
  // 1-й интерполятор: s-интерполятор - используется для подставления значения переменной типа String в строку
  val name: String = "John"
  println(s"Hello, ${name}")  // "Hello, John"
  val lastName: String = "Smith"
  println(s"Hello, ${name + " " + lastName}")  // Hello, John Smith

  // 2-й интерполятор: raw-интерполятор
  val someString: String = "This is \n a String"
  println(raw"This is \n a String")  // This is \n a String
  println(raw"${someString}")
  // => This is
  //    a String

  var link: String = "https://stepik.org"
  println(link :++ "/catalog")
  println(s"The link is \t$link")
}




















