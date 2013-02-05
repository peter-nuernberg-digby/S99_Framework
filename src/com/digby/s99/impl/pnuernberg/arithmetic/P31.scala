package com.digby.s99.impl.pnuernberg.arithmetic

import com.digby.s99.arithmetic.AbstractP31
import com.digby.s99.arithmetic.AbstractP31Runner
import scala.math._

class P31(val i: Int) extends AbstractP31 {
    override def isPrime: Boolean = {
        val limit = round(sqrt(i) + 0.9).toInt
            def isPrimeAux(curr: Int = 2): Boolean = {
                if (curr >= limit) true
                else if (i % curr == 0) false
                else isPrimeAux(curr + 1)
            }
        isPrimeAux()
    }
}

object P31 extends AbstractP31Runner[P31] {
    override implicit def create(i: Int) = new P31(i)
    // unnecessary, but just to show the implicit conversion...
    override def main(args: Array[String]): Unit = {
        println(7.isPrime)
        super.main(args)
    }
}
