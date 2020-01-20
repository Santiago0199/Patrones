package com.santiagoperdomo.patrones.prototype

class Prime: Sequence() {

    init {
        result = nthPrime(1000)
    }

    companion object {

        fun nthPrime(n: Int): Long {

            var i = 2
            var count = 0
            while (count < n) {
                if (isPrime(i))
                    count++
                i++
            }
            return (i - 1).toLong()
        }


        private fun isPrime(n: Int): Boolean {
            for (i in 2 until n) {
                if (n % i == 0) {
                    return false
                }
            }
            return true
        }
    }

}