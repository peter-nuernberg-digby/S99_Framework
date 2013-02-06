package com.digby.s99.arithmetic

import com.digby.s99.Pxx

abstract class AbstractP32 extends Pxx[(Int, Int), Int] {

    /** P32 (**) Determine the greatest common divisor of two positive integer numbers.
      *
      * Use Euclid's algorithm.
      *
      * @example {{{
      * scala> gcd(36, 63)
      * res0: Int = 9}}}
      */
    def gcd(i: Int, j: Int): Int = ???

    override def input = (36, 63)
    override def output = 9
    def op = (args: (Int, Int)) => gcd(args._1, args._2)
}
