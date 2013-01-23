package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP12

object P12 extends AbstractP12 {
    override def decode[A](ls: List[(Int, A)]): List[A] =
        ls flatMap { e => List.make(e._1, e._2) }
}