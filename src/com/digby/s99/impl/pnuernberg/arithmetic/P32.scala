package com.digby.s99.impl.pnuernberg.arithmetic

import com.digby.s99.arithmetic.AbstractP32

object P32 extends AbstractP32 {
    override def gcd(i: Int, j: Int): Int = {
        // the modulo method
        if (j == 0) i
        else if (i > j) gcd(j, i % j)
        else gcd(i, j % i)
        // the subtraction method
        //        if (i == j) i
        //        else if (i > j) gcd((i - j), j)
        //        else gcd(i, (j - i))
    }
}