package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP17

object P17 extends AbstractP17 {
    // Builtin.
    def splitBuiltin[A](n: Int, ls: List[A]): (List[A], List[A]) = ls.splitAt(n)

    // Simple recursion.
    def splitRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
        case (_, Nil)  => (Nil, Nil)
        case (0, list) => (Nil, list)
        case (n, h :: tail) => {
            val (pre, post) = splitRecursive(n - 1, tail)
            (h :: pre, post)
        }
    }

    // Tail recursive.
    def splitTailRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = {
            def splitR(curN: Int, curL: List[A], pre: List[A]): (List[A], List[A]) =
                (curN, curL) match {
                    case (_, Nil)       => (pre.reverse, Nil)
                    case (0, list)      => (pre.reverse, list)
                    case (n, h :: tail) => splitR(n - 1, tail, h :: pre)
                }
        splitR(n, ls, Nil)
    }

    // Functional (barely not "builtin").
    def splitFunctional[A](n: Int, ls: List[A]): (List[A], List[A]) =
        (ls.take(n), ls.drop(n))

    override def split[A](n: Int, l: List[A]): (List[A], List[A]) = splitFunctional(n, l)
}