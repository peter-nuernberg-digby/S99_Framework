package com.digby.s99.arithmetic

import com.digby.s99.Pxx

abstract class AbstractP31 {

    /** P31 (**) Determine whether a given integer number is prime.
      *
      * @example {{{
      * scala> 7.isPrime
      * res0: Boolean = true}}}
      */
    def isPrime: Boolean = ???
}

abstract class AbstractP31Runner[T <% AbstractP31] extends Pxx[Int, Boolean] {
    implicit def create(i: Int): T
    override def input = 7
    override def output = true
    def op = (arg: Int) => create(arg).isPrime
}
