package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP22

object P22 extends AbstractP22 {
    override def range(l: Int, h: Int): List[Int] = {
        def rangeAux(curr: Int, acc: List[Int]): List[Int] =
            if (curr < l) acc
            else rangeAux(curr - 1, curr :: acc)
        rangeAux(h, Nil)
    }
}