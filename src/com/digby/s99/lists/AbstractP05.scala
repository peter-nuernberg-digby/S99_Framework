package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP05 extends Pxx[List[Int], List[Int]] {

    /** P05 (*) Reverse a list.
      *
      * @example {{{
      * scala> reverse(List(1, 1, 2, 3, 5, 8))
      * res0: List[Int] = List(8, 5, 3, 2, 1, 1)}}}
      */
    def reverse[A](l: List[A]): List[A]

    def input = List(1, 1, 2, 3, 5, 8)
    def output = List(8, 5, 3, 2, 1, 1)
    def op = reverse
}
