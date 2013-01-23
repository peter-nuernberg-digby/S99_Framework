package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP13

object P13 extends AbstractP13 {
    // This is basically a modification of P09.
    override def encodeDirect[A](ls: List[A]): List[(Int, A)] =
        if (ls.isEmpty) Nil
        else {
            val (packed, next) = ls span { _ == ls.head }
            (packed.length, packed.head) :: encodeDirect(next)
        }
}