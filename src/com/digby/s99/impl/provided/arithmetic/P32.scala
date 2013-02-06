package com.digby.s99.impl.provided.arithmetic

import com.digby.s99.arithmetic.AbstractP32

object P32 extends AbstractP32 {
    override def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n)
}