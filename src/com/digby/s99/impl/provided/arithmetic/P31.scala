package com.digby.s99.impl.provided.arithmetic

import com.digby.s99.arithmetic.AbstractP31
import com.digby.s99.arithmetic.AbstractP31Runner
import scala.math._

class P31(val start: Int) extends AbstractP31 {
    override def isPrime: Boolean =
        (start > 1) && (P31.primes takeWhile { _ <= Math.sqrt(start) } forall { start % _ != 0 })
}

object P31 extends AbstractP31Runner[P31] {
    val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })

    override implicit def create(i: Int) = new P31(i)
    // unnecessary, but just to show the implicit conversion...
    override def main(args: Array[String]): Unit = {
        println(7.isPrime)
        super.main(args)
    }
}
