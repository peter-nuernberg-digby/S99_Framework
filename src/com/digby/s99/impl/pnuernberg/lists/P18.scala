package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP18

object P18 extends AbstractP18 {
    override def slice[A](i: Int, k: Int, l: List[A]): List[A] = {
            def sliceAux[A](curr: Int, rest: List[A], acc: List[A]): List[A] = {
                if ((rest == Nil) || (curr >= k)) acc.reverse
                else {
                    val newAcc: List[A] = if (curr < i) { // discard head
                        acc
                    }
                    else { // keep head
                        rest.head :: acc
                    }
                    sliceAux(curr + 1, rest.tail, newAcc)
                }
            }
        sliceAux(0, l, Nil)
    }
}