package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP21 extends Pxx[(Symbol, Int, List[Symbol]), List[Symbol]] {

    /** P21 (*) Insert an element at a given position into a list.
      *
      * @example {{{
      * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
      * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)}}}
      */
    def insertAt[A](e: A, k: Int, l: List[A]): List[A] = ???

    override def input = ('new, 1, List('a, 'b, 'c, 'd))
    override def output = List('a, 'new, 'b, 'c, 'd)
    def op = (args: (Symbol, Int, List[Symbol])) => insertAt(args._1, args._2, args._3)
}