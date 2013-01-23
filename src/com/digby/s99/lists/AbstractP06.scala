package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP06 extends Pxx[List[Int], Boolean] {

    /** P06 (*) Find out whether a list is a palindrome.
      *
      * @example {{{
      * scala> isPalindrome(List(1, 2, 3, 2, 1))
      * res0: Boolean = true}}}
      */
    def isPalindrome[A](l: List[A]): Boolean = ???

    override def input = List(1, 2, 3, 2, 1)
    override def output = true
    def op = isPalindrome
}
