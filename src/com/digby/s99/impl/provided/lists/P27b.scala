package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP27b

object P27b extends AbstractP27b {
    override def group[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
        case Nil => List(Nil)
        case n :: ns => P26.combinations(n, ls) flatMap { c =>
            group(ns, ls.diff(c)) map { c :: _ }
        }
    }
}