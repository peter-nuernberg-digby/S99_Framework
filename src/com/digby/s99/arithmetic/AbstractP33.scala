package com.digby.s99.arithmetic

import com.digby.s99.Pxx

abstract class AbstractP33 {

    /** P33 (*) Determine whether two positive integer numbers are coprime.
      *
      * Two numbers are coprime if their greatest common divisor equals 1.
      *
      * @example {{{
      * scala> 35.isCoprimeTo(64)
      * res0: Boolean = true}}}
      */
    def isCoprimeTo(n: Int): Boolean = ???
}

abstract class AbstractP33Runner[T <% AbstractP33] extends Pxx[(Int, Int), Boolean] {
    implicit def create(i: Int): T
    override def input = (35, 64)
    override def output = true
    def op = (args: (Int, Int)) => create(args._1).isCoprimeTo(args._2)
}
