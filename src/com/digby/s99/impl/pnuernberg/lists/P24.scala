package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP24

object P24 extends AbstractP24 {
    override def lotto(n: Int, m: Int): List[Int] = P23.randomSelect(n, (1 to m).toList)
}