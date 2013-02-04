package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP24 extends Pxx[(Int, Int), List[Int]]{

    /** P24 (*) Lotto: Draw N different random numbers from the set 1..M.
      *
      * @example {{{
      * scala> lotto(6, 49)
      * res0: List[Int] = List(23, 1, 17, 33, 21, 37)}}}
      */
    def lotto(n: Int, m: Int): List[Int] = ???

    override def input = (6, 49)
    override def output = Nil // output could be anything... work this out in the comparison function
    def op = (args: (Int, Int)) => lotto(args._1, args._2)

    def containsComparison(expected: List[Int], actual: List[Int]): Boolean = {
        val (n, m) = input
        val domain = 1 to m
        (actual.distinct.size == n) && actual.foldLeft(true) { (acc: Boolean, e: Int) => acc && domain.contains(e) }
    }
    override def comparison = containsComparison
}