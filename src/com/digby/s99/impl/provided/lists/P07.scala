package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP07

object P07 extends AbstractP07 {
    override def flatten(ls: List[Any]): List[Any] = ls flatMap {
        case ms: List[_] => flatten(ms)
        case e           => List(e)
    }
}