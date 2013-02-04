package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP28a extends Pxx[List[List[Symbol]], List[List[Symbol]]] {

    /** P28a (**) Sorting a list of lists according to length of sublists.
      *
      * We suppose that a list contains elements that are lists themselves.
      * The objective is to sort the elements of the list according to their length.
      * E.g. short lists first, longer lists later, or vice versa.
      *
      * @example {{{
      * scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      * res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))}}}
      */
    def lsort[A](l: List[List[A]]): List[List[A]] = ???
    
    override def input = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    override def output = Nil // output is underspecified... work this out in the comparison function
    def op = lsort
    
    def sortComparison(expected: List[List[Symbol]], actual: List[List[Symbol]]): Boolean = {
        def checkAscendingLengths(l: List[List[Symbol]], curr: Int = 0): Boolean = {
            if (l == Nil) true
            else if (l.head.size < curr) false
            else checkAscendingLengths(l.tail, l.head.size)
        }
        checkAscendingLengths(actual)
    }
    override def comparison = sortComparison
}