package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP10

object P10 extends AbstractP10 {
    import P09.pack
    override def encode[A](ls: List[A]): List[(Int, A)] =
        pack(ls) map { e => (e.length, e.head) }

}