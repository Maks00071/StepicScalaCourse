package Playground.week1basics

import scala.annotation.tailrec

object Recursion extends App {
  // рекурсия
  // факториал

  println("--------------------Обычная рекурсия--------------------")

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))  // 120

  // Как это работает: промежуточные вычисления хранятся в стеке, а это значит,
  // что каждый вызов рекурсивной функции сопряжен с использованием стека

  def factorialWithComment(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого вычисляем факториал ${n-1}")
      var result = n * factorialWithComment(n - 1)
      println(s"Вычислили факториал $n")

      result
    }
  }

  println(factorialWithComment(5))

  println("--------------------Хвостовая рекурсия--------------------")

  // Хвостовая рекурсия (Tail Recursion)
  // Хвостовая рекурсия - это именно то, что применяется при работе с большими данными.
  // Эдакая функциональная форма циклов.

  // определяем основную функцию
  def factorialWithTailRecursion(n: Int): Int = {
    // определяем вспомогательную функцию - В качестве аргументов вспомогательной функции
    // указываем число вызовов (х) (этот аргумент совпадает с одним из
    // аргументов основной функции) - плюс аккумулятор, который будет содержать конечный результат.
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }
    // Вызываем вспомогательную функцию из основной функции. Не забудем указать начальное
    // значение аккумулятора, задающее отправную точку всех вычислений.
    loop(n)
  }
  println(factorialWithTailRecursion(5))

  // Отличительной особенностью функции с хвостовой рекурсией является то,
  // что последней операцией идет вызов этой самой функции.
  // И теперь промежуточные вычисления накапливаются в аккумуляторе.
  //
  //Такое применение вспомогательной функции, написанной в стиле хвостовой рекурссии,
  // позволяет обойтись без использования дополнительного стека для хранения
  // промежуточных результатов.

  println("------------проверим функцию на предмет хвостовой рекурсии------------")

  /**
   * Если вы не уверены, действительно ли вы имплементировали хвостовую рекурсию - можете
   * воспользоваться аннотацией   @tailrec. Этим вы укажете компилятору, что функция
   * должна быть tail recursive, и если это не так, ваш код просто не запустится.
   * Просто импортируйте import scala.annotation.tailrec, а сам  @tailrec пропишите перед
   * рекурсивной функцией:
   */

  def factorialTailWithCheck(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n)
  }

  println(factorialTailWithCheck(5))

  println("-------------------Вывод слова n раз-------------------")

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(x: Int, accumulator: String = word): String = {
      if (x <= 1) accumulator
      else loop(x - 1, s"$word $accumulator")
    }
    loop(n)
  }

  println(repeatWord("hello", 5))  // hello hello hello hello hello
}
























