package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP14 extends Pxx[List[Symbol], List[Symbol]] {

    /** P14 (*) Duplicate the elements of a list.
      *
      * @example {{{
      * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
      * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)}}}
      */
    def duplicate[A](l: List[A]): List[A]

    def input = List('a, 'b, 'c, 'c, 'd)
    def output = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    def op = duplicate
}
