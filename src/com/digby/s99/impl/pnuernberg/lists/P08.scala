package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP08

object P08 extends AbstractP08 {
    override def compress[A](l: List[A]): List[A] = {
            def compressAux[A](l: List[A], acc: List[A] = Nil): List[A] = {
                l match {
                    case Nil => acc.reverse
                    case head :: tail => {
                        val newHead =
                            if ((acc == Nil) || (acc.head != head)) Some(head)
                            else None
                        val newAcc = if (newHead.isEmpty) acc else newHead.get :: acc
                        compressAux(tail, newAcc)
                    }
                }
            }
        compressAux(l)
    }
}