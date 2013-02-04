package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP28b

object P28b extends AbstractP28b {
    override def lsortFreq[A](l: List[List[A]]): List[List[A]] = {
            def freqMap(l: List[List[A]], acc: Map[Int, Int] = Map.empty): Map[Int, Int] = {
                l match {
                    case Nil    => acc
                    case h :: t => freqMap(t, acc + (h.size -> (acc.getOrElse(h.size, 0) + 1)))
                }
            }
        val lsorted = P28a.lsort(l)
        val fmap = freqMap(l)
        lsorted sortWith { (x: List[A], y: List[A]) => fmap.getOrElse(x.size, 0) < fmap.getOrElse(y.size, 0) }
    }
}