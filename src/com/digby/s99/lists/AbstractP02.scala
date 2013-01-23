package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP02 extends Pxx[List[Int], Int] {

    /** P02 (*) Find the last but one element of a list.
      *
      * @example {{{
      * scala> penultimate(List(1, 1, 2, 3, 5, 8))
      * res0: Int = 5}}}
      */
    def penultimate[A](l: List[A]): A

    def input = List(1, 1, 2, 3, 5, 8)
    def output = 5
    def op = penultimate
}
