package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP25

object P25 extends AbstractP25 {
    // This algorithm is O(n^2), but it makes up for that in simplicity of
    // implementation.
    import P23.randomSelect
    def randomPermute1[A](ls: List[A]): List[A] = randomSelect(ls.length, ls)

    /* This doesn't compile for me: "No ClassTag available for A" */
    // The canonical way to shuffle imperatively is Fisher-Yates.  It requires a
    // mutable array.  This is O(n).
    //    def randomPermute[A](ls: List[A]): List[A] = {
    //        val rand = new util.Random
    //        val a = ls.toArray
    //        for (i <- a.length - 1 to 1 by -1) {
    //            val i1 = rand.nextInt(i + 1)
    //            val t = a(i)
    //            a.update(i, a(i1))
    //            a.update(i1, t)
    //        }
    //        a.toList
    //    }

    override def randomPermute[A](l: List[A]): List[A] = randomPermute1(l)
    
    // Efficient purely functional algorithms for shuffling are a lot harder.  One
    // is described in http://okmij.org/ftp/Haskell/perfect-shuffle.txt using
    // Haskell. Implementing it in Scala is left as an exercise for the reader.
}