package day1

private object Runner {
    fun run () {
        val (distance, score) = solveDay1(
            Runner::class.java.getResource("/day1/day1.txt")!!.readText().trim()
        )

        println("distances: $distance")
        println("score: $score")
    }
}

fun main() {
    Runner.run()
}