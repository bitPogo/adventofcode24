package day1

fun solveDay1(
    content: String
): Pair<Int, Int> {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    content.split("\n").forEach { line ->
        val (number1, number2) = line.split(regex = "\\s+".toRegex())
        list1.add(number1.toInt())
        list2.add(number2.toInt())
    }

    return aggregateDistances(list1, list2) to calculateSimilarityScore(list1, list2)
}