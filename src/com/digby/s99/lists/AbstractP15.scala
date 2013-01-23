package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP15 extends Pxx[(Int, List[Symbol]), List[Symbol]] {

    /** P15 (**) Duplicate the elements of a list a given number of times.
      *
      * @example {{{
      * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)}}}
      */
    def duplicateN[A](n: Int, l: List[A]): List[A] = ???

    override def input = (3, List('a, 'b, 'c, 'c, 'd))
    override def output = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    def op = (args: (Int, List[Symbol])) => duplicateN(args._1, args._2)
}
