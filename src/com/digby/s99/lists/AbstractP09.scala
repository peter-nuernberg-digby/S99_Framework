package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP09 extends Pxx[List[Symbol], List[List[Symbol]]]{

    /** P09 (**) Pack consecutive duplicates of list elements into sublists.
      *
      * If a list contains repeated elements they should be placed in separate sublists.
      *
      * @example {{{
      * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))}}}
      */
    def pack[A](l: List[A]): List[List[A]]

    def input = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    def output = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    def op = pack
}
