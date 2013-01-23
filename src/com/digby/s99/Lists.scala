package com.digby.s99

import lists._

object Lists {

    /** P19 (**) Rotate a list N places to the left.
      *
      * @example {{{
      * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)}}}
      *
      * @example {{{
      * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)}}}
      */
    def rotate[A](n: Int, l: List[A]): List[A] = ???

    /** P20 (*) Remove the Kth element from a list.
      *
      * Return the list and the removed element in a Tuple. Elements are numbered from 0.
      *
      * @example {{{
      * scala> removeAt(1, List('a, 'b, 'c, 'd))
      * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)}}}
      */
    def removeAt[A](k: Int, l: List[A]): (List[A], A) = ???

    /** P21 (*) Insert an element at a given position into a list.
      *
      * @example {{{
      * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
      * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)}}}
      */
    def insertAt[A](e: A, k: Int, l: List[A]): List[A] = ???

    /** P22 (*) Create a list containing all integers within a given range.
      *
      * @example {{{
      * scala> range(4, 9)
      * res0: List[Int] = List(4, 5, 6, 7, 8, 9)}
      */
    def range(l: Int, h: Int): List[Int] = ???

    /** P23 (**) Extract a given number of randomly selected elements from a list.
      *
      * @example {{{
      * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
      * res0: List[Symbol] = List('e, 'd, 'a)}}}
      *
      * Hint: Use the solution to problem P20
      */
    def randomSelect[A](k: Int, l: List[A]): List[A] = ???

    /** P24 (*) Lotto: Draw N different random numbers from the set 1..M.
      *
      * @example {{{
      * scala> lotto(6, 49)
      * res0: List[Int] = List(23, 1, 17, 33, 21, 37)}}}
      */
    def lotto(n: Int, m: Int): List[Int] = ???

    /** P25 (*) Generate a random permutation of the elements of a list.
      *
      * Hint: Use the solution of problem P23.
      *
      * @example {{{
      * scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
      * res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)}}}
      */
    def randomPermute[A](l: List[A]): List[A] = ???

    /** P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
      *
      * In how many ways can a committee of 3 be chosen from a group of 12 people?
      * We all know that there are C(12,3) = 220 possibilities
      * (C(N,K) denotes the well-known binomial coefficient).
      * For pure mathematicians, this result may be great.
      * But we want to really generate all the possibilities.
      *
      * @example {{{
      * scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
      * res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...}}}
      */
    def combinations[A](k: Int, l: List[A]): List[List[A]] = ???

    /** P27a (**) Group the elements of a set into disjoint subsets.
      *
      * In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.
      *
      * @example {{{
      * scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
      * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...}}}
      */
    def group3[A](l: List[A]): List[List[List[A]]] = ???

    /** P27b (**) Group the elements of a set into disjoint subsets.
      *
      * Generalize the above predicate in a way that we can specify a list of group sizes
      * and the predicate will return a list of groups.
      *
      * @example {{{
      * scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
      * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...}}}
      *
      * Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...)
      * is the same solution as ((Beat, Aldo), ...).
      * However, we make a difference between ((Aldo, Beat), (Carla, David), ...)
      * and ((Carla, David), (Aldo, Beat), ...).
      *
      * You may find more about this combinatorial problem in a good book on discrete
      * mathematics under the term "multinomial coefficients".
      */
    def group[A](g: List[Int], l: List[A]): List[List[List[A]]] = ???

    /** P28a (**) Sorting a list of lists according to length of sublists.
      *
      * We suppose that a list contains elements that are lists themselves.
      * The objective is to sort the elements of the list according to their length.
      * E.g. short lists first, longer lists later, or vice versa.
      *
      * @example {{{
      * scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      * res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))}}}
      */
    def lsort[A](l: List[List[A]]): List[List[A]] = ???

    /** P28b (**) Sorting a list of lists according to length of sublists.
      *
      * Again, we suppose that a list contains elements that are lists themselves.
      * But this time the objective is to sort the elements according to their length frequency;
      * i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed,
      * others with a more frequent length come later.
      *
      * @example {{{
      * scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      * res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))}}}
      *
      * Note that in the above example, the first two lists in the result have length 4 and 1
      * and both lengths appear just once. The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2. This is the most frequent length.
      */
    def lsortFreq[A](l: List[List[A]]): List[List[A]] = ???

    /** Runs all problem solutions in the "lists" package.
      */
    def main(args: Array[String]): Unit = {

        if (args.length == 0) {
            Console.err.println("usage: Lists <implementation-name>*")
            return
        }

        println(runImplementations(args.toList))

        /*        P01.main(args)
        P02.main(args)
        P03.main(args)
        P04.main(args)
        P05.main(args)
        P06.main(args)
        P07.main(args)
        P08.main(args)
        P09.main(args)
        P10.main(args)
        P11.main(args)
        P12.main(args)
        P13.main(args)
        P14.main(args)
        P15.main(args)*/
    }

    private def runImplementations(impls: List[String], acc: Map[String, Results] = Map()): Map[String, Results] = {
        if (impls == Nil) {
            acc
        } else {
            runImplementations(impls.tail, acc + (impls.head -> runImplementation(impls.head)))
        }
    }

    private def runImplementation(impl: String): Results = {
        val listPackageName = "com.digby.s99.impl." + impl + ".lists"
        var results = new Results()
        for (index <- 1 to 3) {
            val className = listPackageName + "." + "P%02d".format(index) + "$"
            try {
                val mth = Class.forName(className).newInstance.asInstanceOf[{ def test(curr: Results): Results }]
                results = mth.test(results)
            } catch {
                case thr: Throwable => {
                	thr.printStackTrace
                    results = results.miss("" + index)
                }
            }
        }
        results
    }
}
