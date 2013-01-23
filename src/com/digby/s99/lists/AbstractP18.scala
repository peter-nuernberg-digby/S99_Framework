package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP18 extends Pxx[(Int, Int, List[Symbol]), List[Symbol]]{

    /** P18 (**) Extract a slice from a list.
      *
      * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
      *
      * @example {{{
      * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res0: List[Symbol] = List('d, 'e, 'f, 'g)}}}
      */
    def slice[A](i: Int, k: Int, l: List[A]): List[A] = ???

    override def input = (3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    override def output = List('d, 'e, 'f, 'g)
    def op = (args: (Int, Int, List[Symbol])) => slice(args._1, args._2, args._3)
}