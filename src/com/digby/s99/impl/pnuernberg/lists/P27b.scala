package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP27b

object P27b extends AbstractP27b {
    override def group[A](g: List[Int], l: List[A]): List[List[List[A]]] = {
        g match {
            case Nil         => Nil // oink!
            case head :: Nil => P26.combinations(head, l) map { List(_) } // end of recursion
            case head :: tail => P26.combinations(head, l) flatMap { (h: List[A]) => group(g.tail, l.diff(h)) map {h :: _ } }
        }
    }
}