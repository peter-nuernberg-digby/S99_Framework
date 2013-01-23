package com.digby.s99.impl.pnuernberg.lists

import com.digby.s99.Results

object Lists {

    def main(args: Array[String]): Unit = {
        var results = new Results()
        results = P01.test(results)
        results = P02.test(results)
        results = P03.test(results)
        results = P04.test(results)
        results = P05.test(results)
        results = P06.test(results)
        results = P07.test(results)
        results = P08.test(results)
        results = P09.test(results)
        results = P10.test(results)
        results = P11.test(results)
        results = P12.test(results)
        results = P13.test(results)
        results = P14.test(results)
        results = P15.test(results)
        results = P16.test(results)
        results = P17.test(results)
        println(results)
    }

}