package Playground.week1basics

import scala.annotation.tailrec

object PowerOfTwo extends App {
  def powerTwo(pow: Int): BigInt = {
    @tailrec
    def loop(x: Int, accumulator: BigInt = 1): BigInt = {
      if (x < 1) accumulator
      else loop(x - 1, 2 * accumulator)
    }
    loop(pow)
  }

  println(powerTwo(10))
}
