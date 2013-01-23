package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP19 extends Pxx[(Int, List[Symbol]), List[Symbol]] {

    /** P19 (**) Rotate a list N places to the left.
      *
      * @example {{{
      * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)}}}
      *
      * @example {{{
      * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)}}}
      */
    def rotate[A](n: Int, l: List[A]): List[A] = ???

    override def pairs = List( //
            ((3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)), //
            ((-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)), List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)))
    def op = (args: (Int, List[Symbol])) => rotate(args._1, args._2)
}