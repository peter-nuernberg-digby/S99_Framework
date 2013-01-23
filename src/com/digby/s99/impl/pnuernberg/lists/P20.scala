package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP20

object P20 extends AbstractP20 {
    override def removeAt[A](k: Int, l: List[A]): (List[A], A) = {
        val (f, r) = l.splitAt(k)
        (f ++ r.tail, r.head)
    }
}