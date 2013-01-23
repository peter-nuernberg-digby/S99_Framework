package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP14

object P14 extends AbstractP14 {
    override def duplicate[A](l: List[A]): List[A] = l.reverse.foldLeft(List[A]()) { (acc: List[A], elem: A) => elem :: elem :: acc }
}
