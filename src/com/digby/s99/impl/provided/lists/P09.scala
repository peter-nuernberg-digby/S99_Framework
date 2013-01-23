package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP09

object P09 extends AbstractP09 {
    override def pack[A](ls: List[A]): List[List[A]] = {
        if (ls.isEmpty) List(List())
        else {
            val (packed, next) = ls span { _ == ls.head }
            if (next == Nil) List(packed)
            else packed :: pack(next)
        }
    }
}