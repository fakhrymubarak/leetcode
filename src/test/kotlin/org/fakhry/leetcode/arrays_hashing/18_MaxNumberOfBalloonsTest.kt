package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxNumberOfBalloonsTest {

    @Test
    fun `test with exact letters for one balloon`() {
        val text = "balloon"
        val result = maxNumberOfBalloons(text)
        assertEquals(1, result) // Can form exactly one "balloon"
    }

    @Test
    fun `test with multiple occurrences of balloon`() {
        val text = "loonbalxballpoon"
        val result = maxNumberOfBalloons(text)
        assertEquals(2, result) // Can form two "balloon"
    }

    @Test
    fun `test with insufficient letters`() {
        val text = "balon"
        val result = maxNumberOfBalloons(text)
        assertEquals(0, result) // Not enough letters to form a single "balloon"
    }

    @Test
    fun `test with insufficient letters 2`() {
        val text = "lloo"
        val result = maxNumberOfBalloons(text)
        assertEquals(0, result) // Not enough letters to form a single "balloon"
    }

    @Test
    fun `test with excess letters but insufficient repeating letters`() {
        val text = "ballxoon"
        val result = maxNumberOfBalloons(text)
        assertEquals(1, result) // Can form exactly one "balloon"
    }

    @Test
    fun `test with no letters for balloon`() {
        val text = "xyz"
        val result = maxNumberOfBalloons(text)
        assertEquals(0, result) // No "balloon" letters present
    }

    @Test
    fun `test with an empty string`() {
        val text = ""
        val result = maxNumberOfBalloons(text)
        assertEquals(0, result) // No letters to form "balloon"
    }

    @Test
    fun `test with large input having multiple balloons`() {
        val text = "balloon".repeat(100)
        val result = maxNumberOfBalloons(text)
        assertEquals(100, result) // Can form 100 "balloon"
    }

    @Test
    fun `test with repeating but uneven distribution of letters`() {
        val text = "baallloon"
        val result = maxNumberOfBalloons(text)
        assertEquals(1, result) // Can form only one "balloon"
    }
}
