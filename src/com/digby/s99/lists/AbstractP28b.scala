package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP28b extends Pxx[List[List[Symbol]], List[List[Symbol]]] {

    /** P28b (**) Sorting a list of lists according to length of sublists.
      *
      * Again, we suppose that a list contains elements that are lists themselves.
      * But this time the objective is to sort the elements according to their length frequency;
      * i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed,
      * others with a more frequent length come later.
      *
      * @example {{{
      * scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      * res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))}}}
      *
      * Note that in the above example, the first two lists in the result have length 4 and 1
      * and both lengths appear just once. The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2. This is the most frequent length.
      */
    def lsortFreq[A](l: List[List[A]]): List[List[A]] = ???

    override def input = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    override def output = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
    def op = lsortFreq

    def sortComparison(expected: List[List[Symbol]], actual: List[List[Symbol]]): Boolean = {
            def lengthFreq(l: List[Symbol], all: List[List[Symbol]] = input, acc: Int = 0): Int = {
                all match {
                    case Nil    => acc
                    case h :: t => lengthFreq(l, all.tail, acc + (if (l.size == h.size) 1 else 0))
                }
            }
            def checkAscendingFreqs(l: List[List[Symbol]], curr: Int = 0): Boolean = {
                if (l == Nil) true
                else if (lengthFreq(l.head) < curr) false
                else checkAscendingFreqs(l.tail, lengthFreq(l.head))
            }
        checkAscendingFreqs(actual)
    }
    override def comparison = sortComparison
}