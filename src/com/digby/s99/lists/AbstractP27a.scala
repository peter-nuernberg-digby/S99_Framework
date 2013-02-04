package com.digby.s99.lists

import com.digby.s99.Pxx

abstract class AbstractP27a extends Pxx[List[String], List[List[List[String]]]] {

    /** P27a (**) Group the elements of a set into disjoint subsets.
      *
      * In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.
      *
      * @example {{{
      * scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
      * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...}}}
      */
    def group3[A](l: List[A]): List[List[List[A]]] = ???

    override def input = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    override def output = List[List[List[String]]]() // output is huge... work this out in the comparison function
    def op = group3

    /*
     * actual is a list of solutions,
     * in which each entry is a solution = a list of buckets
     * in which each entry is a bucket
     * 
     * solutions can appear in any order, and can be vetted in any order, as long as there are the
     * correct number of them (C(9, (2, 3, 4)))
     * 
     * buckets in principle should be in the same order as the sizes -- otherwise, there's no good
     * general way of knowing how to evaluate answer for problems with multiple buckets of the same
     * size
     * 
     * contents of a bucket should be sorted to ensure no duplicate solutions
     * 
     * once we have a distinct set of solutions, we should ensure that for each proposed solution:
     * a) all buckets have the correct size; and, b) the difference of the union of the buckets from
     * the original list has the correct size (/l/ - sum(k))
     */
    def combinationComparison(expected: List[List[List[String]]], actual: List[List[List[String]]]): Boolean = {
        val k = List(2, 3, 4)
        val ksum = k.foldLeft(0) { _ + _ }
        val numLeftover = input.size - ksum
            def fact(i: Int): Int = if (i <= 1) 1 else i * fact(i - 1)
            def multCoeff(n: Int, k: List[Int]): Int = (fact(n) / (k.foldLeft(1) { (acc: Int, e: Int) => acc * fact(e) })).toInt
            def bucketCorrectlySize(b: List[String], i: Int): Boolean = b.size == k(i)
            def allBucketsCorrectlySized(s: List[List[String]], i: Int = 0): Boolean = {
                if (s == Nil) true
                else if (!bucketCorrectlySize(s.head, i)) false
                else allBucketsCorrectlySized(s.tail, i + 1)
            }
        // each bucket must be sorted
        val sorted = (actual map { (s: List[List[String]]) => s map { (b: List[String]) => b.distinct.sorted } }).distinct
        // each bucket must be the correct size
        val correctSizes = (sorted map { (s: List[List[String]]) => allBucketsCorrectlySized(s) }).foldLeft(true) { _ && _ }
        // check that each proposed solution really is a solution
        val allValid = (sorted map { (s: List[List[String]]) => s.flatten.diff(input).size == numLeftover }).foldLeft(true) { _ && _ }
        correctSizes && allValid
    }
    override def comparison = combinationComparison
}