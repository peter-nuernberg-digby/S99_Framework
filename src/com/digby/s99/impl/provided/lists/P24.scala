package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP24

object P24 extends AbstractP24 {
    import P23.randomSelect
    override def lotto(count: Int, max: Int): List[Int] =
        randomSelect(count, List.range(1, max + 1))
}