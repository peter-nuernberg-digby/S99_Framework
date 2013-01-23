package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP12

object P12 extends AbstractP12 {
    override def decode[A](l: List[(Int, A)]): List[A] = {
            def decodeAux[A](l: List[(Int, A)], acc: List[A] = Nil): List[A] = {
                if (l == Nil) acc.reverse
                else {
                    val (count, elem) = l.head
                    if (count == 0) decodeAux(l.tail, acc)
                    else decodeAux(((count - 1), elem) :: l.tail, elem :: acc)
                }
            }
        decodeAux(l)
    }
}