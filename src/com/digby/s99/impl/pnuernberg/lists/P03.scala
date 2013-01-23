package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP03

object P03 extends AbstractP03 {
    override def nth[A](index: Int, l: List[A]): A = {
            def nthAux[A](index: Int, l: List[A], current: Int = 0): A = {
                if (l == Nil) throw new NoSuchElementException("one element list too short to have a penultimate element")
                else if (current == index) l.head
                else nthAux(index, l.tail, current + 1)
            }
        nthAux(index, l)
    }
}