package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP11 extends Pxx[List[Symbol], List[Any]] {

    /** P11 (*) Modified run-length encoding.
      *
      * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
      *
      * @example {{{
      * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))}}}
      */
    def encodeModified[A](l: List[A]): List[Any] = ???

    override def input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    override def output = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    def op = encodeModified
}
