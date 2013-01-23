package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP19

object P19 extends AbstractP19 {
    override def rotate[A](n: Int, l: List[A]): List[A] = {
        l.zipWithIndex map { (p: (A, Int)) => ((p._2 - n + l.size) % l.size, p._1) } sortWith { (p1: (Int, A), p2: (Int, A)) => p1._1 < p2._1 } map { (p: (Int, A)) => p._2 }
    }
}