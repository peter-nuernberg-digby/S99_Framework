package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP08 extends Pxx[List[Symbol], List[Symbol]] {

    /** P08 (**) Eliminate consecutive duplicates of list elements.
      *
      * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
      * Example:
      *
      * @example {{{
      * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)}}}
      */
    def compress[A](l: List[A]): List[A] = ???

    override def input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    override def output = List('a, 'b, 'c, 'a, 'd, 'e)
    def op = compress
}
