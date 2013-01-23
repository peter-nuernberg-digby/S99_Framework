package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP11

object P11 extends AbstractP11 {
    override def encodeModified[A](l: List[A]): List[Any] = P09.pack(l) map { (e: List[A]) =>
        e.size match {
            case 1      => e.head
            case n: Int => (n, e.head)
        }
    }
}