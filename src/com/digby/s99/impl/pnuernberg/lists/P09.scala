package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP09

object P09 extends AbstractP09 {
    override def pack[A](l: List[A]): List[List[A]] = {
            def packAux[A](l: List[A], acc: List[List[A]] = Nil, curr: Option[A] = None): List[List[A]] = {
                l match {
                    case Nil => acc.reverse
                    case head :: tail => {
                        val newAcc = if (curr.isEmpty || (curr.get != head)) { // new elem
                            List[A](head) +: acc
                        } else { // repeated elem
                            (acc.head :+ head) +: acc.tail
                        }
                        packAux(tail, newAcc, Some(head))
                    }
                }
            }
        packAux(l)
    }
}