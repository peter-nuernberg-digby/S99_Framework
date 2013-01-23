package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP05

object P05 extends AbstractP05 {
    override def reverse[A](l: List[A]): List[A] = if (l == Nil) Nil else reverse(l.tail) :+ l.head
}