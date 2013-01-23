package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP06

object P06 extends AbstractP06 {
    override def isPalindrome[A](l: List[A]): Boolean = l == l.reverse
}