package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP21

object P21 extends AbstractP21 {
    override def insertAt[A](e: A, k: Int, l: List[A]): List[A] = {
        val (f, r) = l.splitAt(k)
        f ++ List(e) ++ r
    }
}