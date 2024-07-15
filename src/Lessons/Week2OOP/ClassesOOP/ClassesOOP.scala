package Lessons.Week2OOP.ClassesOOP

object ClassesOOP extends App {
  val student = new Student(1, "Sam")
  println(student.getId("Pam", 2))  // Sam has ID 1 and Pam has ID 2
  println(student.getId())  // here is Sam's ID 1
}

class Student(id: Int, val name: String) {

  // конструкторы
  def this(name: String) = this(0, name)
  def this() = this(0, "NoName")

  // методы
  def getId(name: String, id: Int): String = {
    s"${this.name} has ID ${this.id} and $name has ID $id"
  }

  // Перегрузка метода(Overloading)
  // Позволяет иметь функции с одинаковым названием.
  // Единственное условие - чтобы набор аргументов  и(или) их тип был разный, чтобы компилятор мог понять,
  // вызов какой именнно функции вам требуется

  def getId(): String = {
    s"here is $name's ID $id"
  }
}


