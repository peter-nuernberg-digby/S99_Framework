package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP03 extends Pxx[(Int, List[Int]), Int] {

    /** P03 (*) Find the Kth element of a list.
      *
      * By convention, the first element in the list is element 0.
      *
      * @example {{{
      * scala> nth(2, List(1, 1, 2, 3, 5, 8))
      * res0: Int = 2}}}
      */
    def nth[A](index: Int, l: List[A]): A = ???

    override def input = (2, List(1, 1, 2, 3, 5, 8))
    override def output = 2
    def op = (args: (Int, List[Int])) => nth(args._1, args._2)
}
