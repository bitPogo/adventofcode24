package day1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionDay1Spec {
    @Test
    fun `When solveDay1 is called Then it return the sum of distances of the given File`() {
        // Given
        val fileContent = SolutionDay1Spec::class.java.getResource("/day1/day1Test.txt")!!.readText()

        // When
        val (distances, score) = solveDay1(fileContent)

        // Then
        assertEquals(
            actual = distances,
            expected = 11
        )

        assertEquals(
            actual = score,
            expected = 31
        )
    }
}