package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP28a

object P28a extends AbstractP28a {
    override def lsort[A](l: List[List[A]]): List[List[A]] = l.sortWith(_.size < _.size)
}