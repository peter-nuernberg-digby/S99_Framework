package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP28b

object P28b extends AbstractP28b {
    override def lsortFreq[A](ls: List[List[A]]): List[List[A]] = {
        val freqs = Map(P10.encode(ls map { _.length } sortWith { _ < _ }) map { _.swap }: _*)
        ls sortWith { (e1, e2) => freqs(e1.length) < freqs(e2.length) }
    }
}