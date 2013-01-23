package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP08

object P08 extends AbstractP08 {
    // Standard recursive.
    def compressRecursive[A](ls: List[A]): List[A] = ls match {
        case Nil       => Nil
        case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
    }

    // Tail recursive.
    def compressTailRecursive[A](ls: List[A]): List[A] = {
            def compressR(result: List[A], curList: List[A]): List[A] = curList match {
                case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
                case Nil       => result.reverse
            }
        compressR(Nil, ls)
    }

    // Functional.
    def compressFunctional[A](ls: List[A]): List[A] =
        ls.foldRight(List[A]()) { (h, r) =>
            if (r.isEmpty || r.head != h) h :: r
            else r
        }

    override def compress[A](l: List[A]): List[A] = compressFunctional(l)
}