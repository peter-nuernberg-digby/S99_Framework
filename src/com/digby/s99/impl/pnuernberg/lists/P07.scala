package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.lists.AbstractP07

object P07 extends AbstractP07 {
    override def flatten(l: List[Any]): List[Any] = {
        if (l == Nil) Nil
        else {
            val fh = l.head match {
                case l: List[Any] => flatten(l)
                case e: Any       => List(e)
            }
            fh ++ flatten(l.tail)
        }
    }
}