package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP23

object P23 extends AbstractP23 {
    val rnd = new scala.util.Random()
    override def randomSelect[A](k: Int, l: List[A]): List[A] = {
            def randomSelectAux[A](domain: List[A], acc: List[A]): List[A] = {
                if ((domain == Nil) || (acc.size == k)) acc.reverse
                else {
                    val (rest, elem) = P20.removeAt(rnd.nextInt(domain.size), domain)
                    randomSelectAux(rest, elem :: acc)
                }
            }
        randomSelectAux(l, Nil)
    }
}