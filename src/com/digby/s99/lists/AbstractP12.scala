package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP12 extends Pxx[List[(Int, Symbol)], List[Symbol]] {

    /** P12 (**) Decode a run-length encoded list.
      *
      * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
      *
      * @example {{{
      * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)}}}
      */
    def decode[A](l: List[(Int, A)]): List[A]

    def input = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    def output = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def op = decode
}
