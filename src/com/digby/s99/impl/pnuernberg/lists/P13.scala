package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP13

object P13 extends AbstractP13 {
    override def encodeDirect[A](l: List[A]): List[(Int, A)] = {
            def encodeDirectAux[A](l: List[A], acc: List[(Int, A)] = Nil): List[(Int, A)] = {
                if (l == Nil) acc.reverse
                else {
                    val newAcc = if ((acc == Nil) || (acc.head._2 != l.head)) { // new elem
                        (1, l.head) +: acc
                    } else {
                        (acc.head._1 + 1, acc.head._2) +: acc.tail
                    }
                    encodeDirectAux(l.tail, newAcc)
                }
            }
        encodeDirectAux(l)
    }
}