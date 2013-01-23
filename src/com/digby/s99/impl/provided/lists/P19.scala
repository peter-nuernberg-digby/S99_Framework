package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP19

object P19 extends AbstractP19 {
    override def rotate[A](n: Int, ls: List[A]): List[A] = {
        val nBounded = if (ls.isEmpty) 0 else n % ls.length
        if (nBounded < 0) rotate(nBounded + ls.length, ls)
        else (ls drop nBounded) ::: (ls take nBounded)
    }
}