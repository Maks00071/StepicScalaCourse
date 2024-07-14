package Playground.week1basics

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val message: String = StdIn.readLine()
    println("Hi, " + message)
  }
}
