package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP10

object P10 extends AbstractP10 {
    override def encode[A](l: List[A]): List[(Int, A)] = P09.pack(l) map { (e: List[A]) => (e.size, e.head) }
}
