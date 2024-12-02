package day1

fun calculateSimilarityScore(list1: List<Int>, list2: List<Int>): Int {
    val score = list1.associateWith { 0 }.toMutableMap()

    list2.forEach { idx ->
        if (idx in score) {
            score[idx] = score[idx]!! + 1
        }
    }

    return list1.sumOf { value ->
        score[value]!! * value
    }
}