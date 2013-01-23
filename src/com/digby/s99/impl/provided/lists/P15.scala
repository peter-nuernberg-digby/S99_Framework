package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP15

object P15 extends AbstractP15 {
    override def duplicateN[A](n: Int, ls: List[A]): List[A] =
        ls flatMap { List.make(n, _) }
}