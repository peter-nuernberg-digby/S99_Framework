package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP07 extends Pxx[List[Any], List[Any]] {

    /** P07 (**) Flatten a nested list structure.
      *
      * @example {{{
      * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
      * res0: List[Any] = List(1, 1, 2, 3, 5, 8)}}}
      */
    def flatten(l: List[Any]): List[Any] = ???

    override def input = List(List(1, 1), 2, List(3, List(5, 8)))
    override def output = List(1, 1, 2, 3, 5, 8)
    def op = flatten
}
