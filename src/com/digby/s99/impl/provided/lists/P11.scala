package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP11

object P11 extends AbstractP11 {
    import P10.encode
    override def encodeModified[A](ls: List[A]): List[Any] =
        encode(ls) map { t => if (t._1 == 1) t._2 else t }

    // Just for fun, here's a more typesafe version.
    def encodeModified2[A](ls: List[A]): List[Either[A, (Int, A)]] =
        encode(ls) map { t => if (t._1 == 1) Left(t._2) else Right(t) }
}