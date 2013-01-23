package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP16 extends Pxx[(Int, List[Symbol]), List[Symbol]] {

    /** P16 (**) Drop every Nth element from a list.
      *
      * @example {{{
      * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)}}}
      */
    def drop[A](n: Int, l: List[A]): List[A] = ???

    override def input = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    override def output = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    def op = (args: (Int, List[Symbol])) => drop(args._1, args._2)
}