package com.santiagoperdomo.patrones.prototype

class Fibonacci : Sequence() {

    init {
        result = nthFibonacci(1000)
    }

    private fun nthFibonacci(n: Int): Long {
        var f0: Long = 0
        var f1: Long = 1

        for (i in 1..n) {
            f0 += f1
            f1 = f0 - f1
        }

        return f0
    }
}
