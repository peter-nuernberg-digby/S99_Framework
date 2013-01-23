package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP15

object P15 extends AbstractP15 {
    override def duplicateN[A](n: Int, l: List[A]): List[A] = {
        if (l == Nil) Nil
        else (for (e <- l) yield List.fill(n)(e)).flatten
    }
}