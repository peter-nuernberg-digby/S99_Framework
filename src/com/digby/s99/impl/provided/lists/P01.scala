package com.digby.s99.impl.provided.lists

import com.digby.s99.lists.AbstractP01

object P01 extends AbstractP01 {

    // There are several ways to solve this problem.  If we use builtins, it's very
    // easy.
    def lastBuiltin[A](ls: List[A]): A = ls.last

    // The standard functional approach is to recurse down the list until we hit
    // the end.  Scala's pattern matching makes this easy.
    def lastRecursive[A](ls: List[A]): A = ls match {
        case h :: Nil  => h
        case _ :: tail => lastRecursive(tail)
        case _         => throw new NoSuchElementException
    }

    override def last[A](ls: List[A]): A = lastRecursive(ls)
}
