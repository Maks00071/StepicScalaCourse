package Playground.week1basics

import scala.annotation.tailrec

object TrainWithString extends App {
  val input: String = "I like     Scala"
  var str: List[String] = input.split(raw"\s+").toList.reverse
  println(str.mkString(" "))
}
