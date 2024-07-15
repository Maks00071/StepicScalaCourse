package Playground.Week2OOP

object SolutionInstructor extends App {
  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName())  // "Вася Пупкин"
  println(instructor.id)  // 1

  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName())  // "Вася Пупкин"
  println(course.getID())  // "21"
  println(course.isTaughtBy(instructor))  // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин")))  // false
  println(course.copyCourse("4321").releaseYear)
}

class Instructor(val id: Int, name: String, surname: String) {

  def fullName(): String = {
    s"${name.capitalize} ${surname.capitalize}"
  }
}

class Course(courseID: Int, title: String, val releaseYear: String, val instructor: Instructor) {

  def getID(): String = {
    s"${courseID}${instructor.id}"
  }

  /**
   * Метод проверяет, является ли указанный человек инструктором курса
   * @param instructor - объект класса Instructor
   * @return - true/false
   */
  def isTaughtBy(instructor: Instructor): Boolean = {
    if (instructor == this.instructor) true else false
  }

  /**
   * Метод возвращает новый экземпляр класса Course с обновленным значением поля releaseYear
   * @param newReleaseYear - новое значение поля releaseYear
   * @return - объект Course
   */
  def copyCourse(newReleaseYear: String): Course = {
    new Course(courseID, title, newReleaseYear, instructor)
  }
}
