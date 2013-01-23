package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP01

object P01 extends AbstractP01 {
    override def last[A](l: List[A]): A = {
        l.foldLeft[Option[A]](None)((acc: Option[A], elem: A) => Some(elem)).get
    }
}
