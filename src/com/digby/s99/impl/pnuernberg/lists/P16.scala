package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP16

object P16 extends AbstractP16 {
    override def drop[A](n: Int, l: List[A]): List[A] = {
        def dropAux[A](n: Int, l: List[A], i: Int, acc: List[A] = Nil): List[A] = {
            if (l == Nil) acc.reverse
            else {
                if (i >= n) { // drop head and reset
                    dropAux(n, l.tail, 1, acc)
                }
                else { // keep head
                    dropAux(n, l.tail, i + 1, l.head :: acc)
                }
            }
        }
        dropAux(n, l, 1)
    }
}