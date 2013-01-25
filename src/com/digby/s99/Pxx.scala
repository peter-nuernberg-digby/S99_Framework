package com.digby.s99

abstract class Pxx[I, O] {

    def input: I = ???
    def output: O = ???
    def op: (I) => O

    def pairs: List[(I, O)] = List((input, output))
    
    def input(run: Int) = pairs(run)._1
    def output(run: Int) = pairs(run)._2
    
    def comparison: (O, O) => Boolean = simpleEquals
    
    def test(acc: Results = new Results(), run: Int = 0, f: (O, O) => Boolean = simpleEquals): Results = {
        if (run >= pairs.size) acc
        else test(confirm(op(input(run)), output(run), acc), run + 1)
    }

    def main(args: Array[String]): Unit = test()

    def confirm(a: => O, e: => O, curr: Results = new Results()): Results = {
        val name = this.getClass().getSimpleName().replaceAll("\\$", "")
        try {
            val actual = a
            val expected = e
            if (comparison(expected, actual)) {
                println(s"$name passed")
                curr.pass(name)
            } else {
                println(s"$name failed, expected $expected but got $actual")
                curr.fail(name)
            }
        } catch {
            case nie: NotImplementedError => {
                println(s"$name not yet implemented")
                curr.fail(name)
            }
            case thr: Throwable => {
                println(s"$name failed, threw exception $thr")
                curr.skip(name)
            }
        }
    }
    
    def simpleEquals[T](a: T, b: T): Boolean = (a == b)
}

class Results(passed: List[String] = Nil, failed: List[String] = Nil, skipped: List[String] = Nil, missed: List[String] = Nil) {

    def pass(name: String) = new Results(name :: passed, failed, skipped, missed)
    def fail(name: String) = new Results(passed, name :: failed, skipped, missed)
    def skip(name: String) = new Results(passed, failed, name :: skipped, missed)
    def miss(name: String) = new Results(passed, failed, name :: skipped, missed)

    def passedNames = passed.reverse
    def failedNames = failed.reverse
    def skippedNames = skipped.reverse
    def missedNames = missed.reverse

    override def toString = "#passed = " + passed.length +
        "; #failed = " + failed.length +
        "; #skipped = " + skipped.length +
        "; #missed = " + missed.length
}