package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP26

object P26 extends AbstractP26 {
    override def combinations[A](k: Int, l: List[A]): List[List[A]] = {
        if (l == Nil) Nil
        else if (k == 1) l map { (e: A) => List(e) }
        else (combinations((k - 1), l.tail) map { (e : List[A]) => l.head :: e }) ++ combinations(k, l.tail)
    }
}