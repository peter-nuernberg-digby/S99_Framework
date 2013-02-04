package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP25

object P25 extends AbstractP25 {
    override def randomPermute[A](l: List[A]): List[A] = P23.randomSelect(l.size, l)
}