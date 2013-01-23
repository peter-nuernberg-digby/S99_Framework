package com.digby.s99.impl.provided.lists

import com.digby.s99.Results

object Lists {

    def main(args: Array[String]): Unit = {
        var results = new Results()
        results = P01.test(results)
        results = P02.test(results)
        results = P03.test(results)
        results = P04.test(results)
        results = P05.test(results)
        println(results)
    }
}