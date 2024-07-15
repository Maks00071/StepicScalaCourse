package Playground.Week2OOP

object Main extends App {
  val employee = new Employee()
  println(s"${employee.name}'s salary is ${employee.salary}")

}

class Employee(val name: String, var salary: Double) {

  def this() = this("John", 0)
}