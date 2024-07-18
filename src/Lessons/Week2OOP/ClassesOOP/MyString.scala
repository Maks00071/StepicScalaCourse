package Lessons.Week2OOP.ClassesOOP

class MyString(val str: String) {
  private var extra: String = "extraData"

  def getString: String = str + extra
}


object MyString extends App {

  def apply(base: String, extras: String): MyString = {
    val s = new MyString(base)
    s.extra = extras
    s
  }

  def apply(base: String): MyString = new MyString(base)

  println(MyString.apply("Hello ", "world").getString)
  println(MyString.apply("welcome").getString)
}
