package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP26 extends Pxx[(Int, List[Symbol]), List[List[Symbol]]] {

    /** P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
      *
      * In how many ways can a committee of 3 be chosen from a group of 12 people?
      * We all know that there are C(12,3) = 220 possibilities
      * (C(N,K) denotes the well-known binomial coefficient).
      * For pure mathematicians, this result may be great.
      * But we want to really generate all the possibilities.
      *
      * @example {{{
      * scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
      * res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...}}}
      */
    def combinations[A](k: Int, l: List[A]): List[List[A]] = ???

    override def input = (3, List('a, 'b, 'c, 'd, 'e, 'f))
    override def output = Nil // output is huge... work this out in the comparison function
    def op = (args: (Int, List[Symbol])) => combinations(args._1, args._2)

    def combinationComparison(expected: List[List[Symbol]], actual: List[List[Symbol]]): Boolean = {
        val (k, l) = input
            def fact(i: Int): Int = if (i <= 1) 1 else i * fact(i - 1)
            def binCoeff(k: Int, n: Int): Int = (fact(n) / (fact(k) * fact(n - k))).toInt
            val actualSortedElements = actual.map { (e: List[Symbol]) => e.sorted(SymbolOrdering) }
        (actualSortedElements.distinct.size == binCoeff(k, l.size)) &&
        actualSortedElements.foldLeft(true) { (acc: Boolean, e: List[Symbol]) => acc && (e.diff(l) == Nil) }
    }
    override def comparison = combinationComparison
}

object SymbolOrdering extends Ordering[Symbol] {
    def compare(x: Symbol, y: Symbol): Int = x.name.compareTo(y.name)
}