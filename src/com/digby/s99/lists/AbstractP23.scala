package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP23 extends Pxx[(Int, List[Symbol]), List[Symbol]] {

    /** P23 (**) Extract a given number of randomly selected elements from a list.
      *
      * @example {{{
      * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
      * res0: List[Symbol] = List('e, 'd, 'a)}}}
      *
      * Hint: Use the solution to problem P20
      */
    def randomSelect[A](k: Int, l: List[A]): List[A] = ???

    override def input = (3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    override def output = Nil // output could be anything... work this out in the comparison function
    def op = (args: (Int, List[Symbol])) => randomSelect(args._1, args._2)

    def containsComparison(expected: List[Symbol], actual: List[Symbol]): Boolean = {
        val (k, l) = input
        (actual.distinct.size == k) && actual.foldLeft(true) { (acc: Boolean, e: Symbol) => acc && l.contains(e) }
    }
    override def comparison = containsComparison
}