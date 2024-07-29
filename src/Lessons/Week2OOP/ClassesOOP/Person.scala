package Lessons.Week2OOP.ClassesOOP

object Main extends App {
  class Person(name: String, age: Int) {
    val gender: String = "n/a"

    def greet: String = s"Hello"

    def this() = this("UnknownPerson", 0)
  }

  // переопределим (override) поле gender в конструкторе
  class Student(name: String, age: Int, id: Int, studGender: String) extends Person {
    override val gender: String = studGender

    // переопределим метод greet
    override def greet: String = s"${super.greet} $name"
  }

  val student = new Student("James", 34, 1, "m")
  println(student.greet)
  println(student.gender)

}

