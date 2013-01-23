package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP16

object P16 extends AbstractP16 {
    // Simple recursion.
    def dropRecursive[A](n: Int, ls: List[A]): List[A] = {
            def dropR(c: Int, curList: List[A]): List[A] = (c, curList) match {
                case (_, Nil)       => Nil
                case (1, _ :: tail) => dropR(n, tail)
                case (_, h :: tail) => h :: dropR(c - 1, tail)
            }
        dropR(n, ls)
    }

    // Tail recursive.
    def dropTailRecursive[A](n: Int, ls: List[A]): List[A] = {
            def dropR(c: Int, curList: List[A], result: List[A]): List[A] = (c, curList) match {
                case (_, Nil)       => result.reverse
                case (1, _ :: tail) => dropR(n, tail, result)
                case (_, h :: tail) => dropR(c - 1, tail, h :: result)
            }
        dropR(n, ls, Nil)
    }

    // Functional.
    def dropFunctional[A](n: Int, ls: List[A]): List[A] =
        ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }

    override def drop[A](n: Int, l: List[A]): List[A] = dropFunctional(n, l)
}