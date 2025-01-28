package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalPointsTest {

    @Test
    fun `test with basic operations`() {
        val operations = arrayOf("5", "2", "C", "D", "+")
        val result = calPoints(operations)
        assertEquals(30, result) // 5 + 10 + 15 = 30
    }

    @Test
    fun `test with all numbers`() {
        val operations = arrayOf("1", "2", "3", "4")
        val result = calPoints(operations)
        assertEquals(10, result) // 1 + 2 + 3 + 4 = 10
    }

    @Test
    fun `test with multiple C operations`() {
        val operations = arrayOf("5", "2", "C", "C")
        val result = calPoints(operations)
        assertEquals(0, result) // All scores are invalidated
    }

    @Test
    fun `test with no operations`() {
        val operations = arrayOf<String>()
        val result = calPoints(operations)
        assertEquals(0, result) // No scores to calculate
    }

    @Test
    fun `test with multiple D operations`() {
        val operations = arrayOf("5", "D", "D", "D")
        val result = calPoints(operations)
        assertEquals(75, result) // 5 + 10 + 20 + 40 = 75
    }

    @Test
    fun `test with complex operations`() {
        val operations = arrayOf("10", "D", "C", "20", "+", "D")
        val result = calPoints(operations)
        assertEquals(120, result) // 10 20 30 60 = 90
    }

    @Test
    fun `test with large numbers`() {
        val operations = arrayOf("1000", "2000", "D", "+", "C")
        val result = calPoints(operations)
        assertEquals(7000, result) // 1000 + 2000 + 4000 = 7000
    }
}
