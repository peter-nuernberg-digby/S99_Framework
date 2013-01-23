package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP21

object P21 extends AbstractP21 {
    override def insertAt[A](e: A, k: Int, l: List[A]): List[A] = l.splitAt(k) match {
        case (pre, post) => pre ::: e :: post
    }
}