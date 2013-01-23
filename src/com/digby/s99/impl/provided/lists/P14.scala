package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP14

object P14 extends AbstractP14 {
    override def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }
}
