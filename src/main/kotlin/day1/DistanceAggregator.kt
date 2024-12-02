package day1

import kotlin.math.abs


fun aggregateDistances(
    list1: List<Int>,
    list2: List<Int>
): Int {
    val sortedList1 = list1.sorted()
    val sortedList2 = list2.sorted()

    return sortedList1.mapIndexed { index, startPoint ->
        abs(sortedList2[index] - startPoint)
    }.sum()
}