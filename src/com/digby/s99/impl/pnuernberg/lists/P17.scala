package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP17

object P17 extends AbstractP17 {
    override def split[A](n: Int, l: List[A]): (List[A], List[A]) = {
            def splitAux[A](l: List[A], i: Int = 0, first: List[A] = Nil): (List[A], List[A]) = {
                if (l == Nil) (first.reverse, Nil)
                else {
                    if (i == n) (first.reverse, l)
                    else splitAux(l.tail, i + 1, l.head :: first)
                }
            }
        splitAux(l)
    }
}