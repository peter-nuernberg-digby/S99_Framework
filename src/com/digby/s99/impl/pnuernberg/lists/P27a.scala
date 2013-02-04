package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP27a

object P27a extends AbstractP27a {
    // I coudn't think of a good way to do this other than use the solution from 27b
    override def group3[A](l: List[A]): List[List[List[A]]] = {
        P27b.group(List(2, 3, 4), l)
    }
}