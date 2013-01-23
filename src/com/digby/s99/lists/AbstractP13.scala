package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP13 extends Pxx[List[Symbol], List[(Int, Symbol)]] {

    /** P13 (**) Run-length encoding of a list (direct solution).
      *
      * Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
      *
      * @example {{{
      * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))}}}
      */
    def encodeDirect[A](l: List[A]): List[(Int, A)]

    def input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def output = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    def op = encodeDirect
}
