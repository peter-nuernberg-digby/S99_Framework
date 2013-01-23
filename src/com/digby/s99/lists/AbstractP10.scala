package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP10 extends Pxx[List[Symbol], List[(Int, Symbol)]] {

    /** P10 (*) Run-length encoding of a list.
      *
      * Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
      *
      * @example {{{
      * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))}}}
      */
    def encode[A](l: List[A]): List[(Int, A)]

    def input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def output = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    def op = encode
}
