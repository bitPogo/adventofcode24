package day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimilarityScoreSpec {
    @Test
    fun `When calculateSimilarityScore is called it returns the similarity score`() {
        // Given
        val list1 = listOf(3, 4, 2, 1, 3, 3)
        val list2 = listOf(4, 3, 5, 3, 9, 3)

        // When
        val actual = calculateSimilarityScore(list1, list2)

        // Then
        assertEquals(
            actual = actual,
            expected = 31
        )
    }
}