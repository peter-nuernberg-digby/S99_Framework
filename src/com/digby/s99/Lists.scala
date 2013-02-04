package com.digby.s99

import lists._

object Lists {

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
