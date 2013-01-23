package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP04 extends Pxx[List[Int], Int] {
    
    /** P04 (*) Find the number of elements of a list.
      *
      * @example {{{
      * scala> length(List(1, 1, 2, 3, 5, 8))
      * res0: Int = 6}}}
      */
    def length[A](l: List[A]): Int

    def input = List(1, 1, 2, 3, 5, 8)
    def output = 6
    def op = length
}
