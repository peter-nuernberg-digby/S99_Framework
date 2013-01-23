package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP20 extends Pxx[(Int, List[Symbol]), (List[Symbol], Symbol)] {

    /** P20 (*) Remove the Kth element from a list.
      *
      * Return the list and the removed element in a Tuple. Elements are numbered from 0.
      *
      * @example {{{
      * scala> removeAt(1, List('a, 'b, 'c, 'd))
      * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)}}}
      */
    def removeAt[A](k: Int, l: List[A]): (List[A], A) = ???

    override def input = (1, List('a, 'b, 'c, 'd))
    override def output = (List('a, 'c, 'd),'b)
    def op = (args: (Int, List[Symbol])) => removeAt(args._1, args._2)
}