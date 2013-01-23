package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP02

object P02 extends AbstractP02 {
    override def penultimate[A](l: List[A]): A = {
        l.size match {
            case 0 => throw new NoSuchElementException("empty list too short to have a penultimate element")
            case 1 => throw new NoSuchElementException("one element list too short to have a penultimate element")
            case 2 => l.head
            case _ => penultimate(l.tail)
        }
    }
}
