package com.digby.s99.impl.provided.arithmetic

import com.digby.s99.arithmetic.AbstractP33
import com.digby.s99.arithmetic.AbstractP33Runner
import scala.math._

class P33(val start: Int) extends AbstractP33 {
    override def isCoprimeTo(n: Int): Boolean = P32.gcd(start, n) == 1
}

object P33 extends AbstractP33Runner[P33] {
    override implicit def create(i: Int) = new P33(i)
}
