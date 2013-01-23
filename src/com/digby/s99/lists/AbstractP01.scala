package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP01 extends Pxx[List[Int], Int] {

    /** P01 (*) Find the last element of a list.
      *
      * @example {{{
      * scala> last(List(1, 1, 2, 3, 5, 8))
      * res0: Int = 8}}}
      */
    def last[A](l: List[A]): A = ???
    
    override def input = List(1, 1, 2, 3, 5, 8)
    override def output = 8
    def op = last
}
