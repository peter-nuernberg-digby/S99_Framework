package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP04

object P04 extends AbstractP04 {
    override def length[A](l: List[A]): Int = if (l == Nil) 0 else 1 + length(l.tail)
}