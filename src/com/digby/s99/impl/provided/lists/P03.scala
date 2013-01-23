package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP03

object P03 extends AbstractP03 {

    // Trivial with builtins.
    def nthBuiltin[A](n: Int, ls: List[A]): A =
        if (n >= 0) ls(n)
        else throw new NoSuchElementException

    // Not that much harder without.
    def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
        case (0, h :: _)    => h
        case (n, _ :: tail) => nthRecursive(n - 1, tail)
        case (_, Nil)       => throw new NoSuchElementException
    }

    override def nth[A](index: Int, l: List[A]): A = nthRecursive(index, l)
}