package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP23

object P23 extends AbstractP23 {
    import P20.removeAt

    def randomSelect1[A](n: Int, ls: List[A]): List[A] =
        if (n <= 0) Nil
        else {
            val (rest, e) = removeAt((new util.Random).nextInt(ls.length), ls)
            e :: randomSelect1(n - 1, rest)
        }

    // It can be expensive to create a new Random instance every time, so let's
    // only do it once.
    override def randomSelect[A](n: Int, ls: List[A]): List[A] = {
            def randomSelectR(n: Int, ls: List[A], r: util.Random): List[A] =
                if (n <= 0) Nil
                else {
                    val (rest, e) = removeAt(r.nextInt(ls.length), ls)
                    e :: randomSelectR(n - 1, rest, r)
                }
        randomSelectR(n, ls, new util.Random)
    }
}