package day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DistanceAggregatorSpec {
    @Test
    fun `When aggregateDistances is called it Then returns the aggregated Distance`() {
        // Given
        val list1 = listOf(3, 4, 2, 1, 3, 3)
        val list2 = listOf(4, 3, 5, 3, 9, 3)

        // When
        val actual = aggregateDistances(list1, list2)

        // Then
        assertEquals(
            actual = actual,
            expected = 11
        )
    }

    @Test
    fun `When aggregateDistances is called it Then returns the aggregated Distance in absolute manor`() {
        // Given
        val list1 = listOf(3, 4, 2, 1, 3, 3)
        val list2 = listOf(4, 3, 5, 3, 9, 3)

        // When
        val actual = aggregateDistances(list2, list1)

        // Then
        assertEquals(
            actual = actual,
            expected = 11
        )
    }
}