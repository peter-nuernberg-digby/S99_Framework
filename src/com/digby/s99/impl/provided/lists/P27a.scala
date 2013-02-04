package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP27a

object P27a extends AbstractP27a {
    override def group3[A](ls: List[A]): List[List[List[A]]] =
        for {
            a <- P26.combinations(2, ls)
            noA = ls.diff(a)
            b <- P26.combinations(3, noA)
        } yield List(a, b, noA.diff(b))
}