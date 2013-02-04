package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP28a

object P28a extends AbstractP28a {
    override def lsort[A](ls: List[List[A]]): List[List[A]] =
        ls sortWith { _.length < _.length }
}