package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP22 extends Pxx[(Int, Int), List[Int]] {

    /** P22 (*) Create a list containing all integers within a given range.
      *
      * @example {{{
      * scala> range(4, 9)
      * res0: List[Int] = List(4, 5, 6, 7, 8, 9)}
      */
    def range(l: Int, h: Int): List[Int] = ???

    override def input = (4, 9)
    override def output = List(4, 5, 6, 7, 8, 9)
    def op = (args: (Int, Int)) => range(args._1, args._2)
}