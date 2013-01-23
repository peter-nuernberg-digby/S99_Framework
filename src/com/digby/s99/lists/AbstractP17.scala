package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP17 extends Pxx[(Int, List[Symbol]), (List[Symbol], List[Symbol])] {

    /** P17 (*) Split a list into two parts.
      *
      * The length of the first part is given. Use a Tuple for your result.
      *
      * @example {{{
      * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))}}}
      */
    def split[A](n: Int, l: List[A]): (List[A], List[A]) = ???

    override def input = (3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    override def output = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    def op = (args: (Int, List[Symbol])) => split(args._1, args._2)
}