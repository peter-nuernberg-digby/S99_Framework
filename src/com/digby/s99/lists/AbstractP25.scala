package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP25 extends Pxx[List[Symbol], List[Symbol]] {

    /** P25 (*) Generate a random permutation of the elements of a list.
      *
      * Hint: Use the solution of problem P23.
      *
      * @example {{{
      * scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
      * res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)}}}
      */
    def randomPermute[A](l: List[A]): List[A] = ???

    override def input = List('a, 'b, 'c, 'd, 'e, 'f)
    override def output = Nil // output could be anything... work this out in the comparison function
    def op = randomPermute

    def containsComparison(expected: List[Symbol], actual: List[Symbol]): Boolean = {
        (actual.size == input.size) && actual.foldLeft(true) { (acc: Boolean, e: Symbol) => acc && input.contains(e) }
    }
    override def comparison = containsComparison

}