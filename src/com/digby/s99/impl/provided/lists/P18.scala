package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP18

object P18 extends AbstractP18 {
    // Builtin.
    def sliceBuiltin[A](start: Int, end: Int, ls: List[A]): List[A] =
        ls.slice(start, end)

    // Simple recursive.
    def sliceRecursive[A](start: Int, end: Int, ls: List[A]): List[A] =
        (start, end, ls) match {
            case (_, _, Nil)                 => Nil
            case (_, e, _) if e <= 0         => Nil
            case (s, e, h :: tail) if s <= 0 => h :: sliceRecursive(0, e - 1, tail)
            case (s, e, h :: tail)           => sliceRecursive(s - 1, e - 1, tail)
        }

    // Tail recursive, using pattern matching.
    def sliceTailRecursive[A](start: Int, end: Int, ls: List[A]): List[A] = {
            def sliceR(count: Int, curList: List[A], result: List[A]): List[A] =
                (count, curList) match {
                    case (_, Nil)                     => result.reverse
                    case (c, h :: tail) if end <= c   => result.reverse
                    case (c, h :: tail) if start <= c => sliceR(c + 1, tail, h :: result)
                    case (c, _ :: tail)               => sliceR(c + 1, tail, result)
                }
        sliceR(0, ls, Nil)
    }

    // Since several of the patterns are similar, we can condense the tail recursive
    // solution a little.
    def sliceTailRecursive2[A](start: Int, end: Int, ls: List[A]): List[A] = {
            def sliceR(count: Int, curList: List[A], result: List[A]): List[A] = {
                if (curList.isEmpty || count >= end) result.reverse
                else sliceR(count + 1, curList.tail,
                    if (count >= start) curList.head :: result
                    else result)
            }
        sliceR(0, ls, Nil)
    }

    // Functional.
    def sliceFunctional[A](s: Int, e: Int, ls: List[A]): List[A] =
        ls drop s take (e - (s max 0))

    override def slice[A](i: Int, k: Int, l: List[A]): List[A] = sliceFunctional(i, k, l)
}