package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP20

object P20 extends AbstractP20 {
    override def removeAt[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
        case (Nil, _) if n < 0 => throw new NoSuchElementException
        case (pre, e :: post)  => (pre ::: post, e)
        case (pre, Nil)        => throw new NoSuchElementException
    }

    // Alternate, with fewer builtins.
    def removeAt2[A](n: Int, ls: List[A]): (List[A], A) =
        if (n < 0) throw new NoSuchElementException
        else (n, ls) match {
            case (_, Nil)       => throw new NoSuchElementException
            case (0, h :: tail) => (tail, h)
            case (_, h :: tail) => {
                val (t, e) = removeAt(n - 1, ls.tail)
                (ls.head :: t, e)
            }
        }
}