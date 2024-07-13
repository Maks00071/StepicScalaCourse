package Playground.week1basics

/**
 * требуется написать программу, которая:
 * -----
 * увеличивает заданное число x на число y n-ое количество раз
 * выводит на экран полученное на шаге 1 число столько раз, сколько в нем цифр, и фразу is the result
 */

import scala.annotation.tailrec

object PowerOfTwoN extends App {
  val result: String = "is the result"

  def powerOftwoN(x: Int, y: Int, n: Int): Int = {
    @tailrec
    def loop(k: Int, accumulator: Int = x): Int = {
      if (k < 1) accumulator
      else {
        loop(k - 1, y + accumulator)
      }
    }
    loop(n)
  }

  private val resultFunc: Int = powerOftwoN(123, 1, 5)

  /** Функция подсчитывает кол-во цифр в числе
   * @param result - аргумент "число"
   * @return - Int
   */
  private def countNumber(result: Int): String = {
    @tailrec
    def loop(x: Int, accumulator: String = ""): String = {
      if (x < 1) accumulator
      else loop(x/10, accumulator + result + " ")
    }
    loop(resultFunc)
  }

  println(countNumber(resultFunc) + result)
}
















