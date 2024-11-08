package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GeneratePascalsTriangleTest {

    @Test
    fun `test with numRows = 0`() {
        val numRows = 0
        val expected = emptyList<List<Int>>()
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with numRows = 1`() {
        val numRows = 1
        val expected = listOf(listOf(1))
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with numRows = 2`() {
        val numRows = 2
        val expected = listOf(
            listOf(1),
            listOf(1, 1)
        )
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with numRows = 3`() {
        val numRows = 3
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1)
        )
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with numRows = 5`() {
        val numRows = 5
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1)
        )
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with numRows = 6`() {
        val numRows = 6
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1),
            listOf(1, 5, 10, 10, 5, 1)
        )
        assertEquals(expected, generatePascalsTriangle(numRows))
    }

    @Test
    fun `test with larger numRows value`() {
        val numRows = 10
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1),
            listOf(1, 5, 10, 10, 5, 1),
            listOf(1, 6, 15, 20, 15, 6, 1),
            listOf(1, 7, 21, 35, 35, 21, 7, 1),
            listOf(1, 8, 28, 56, 70, 56, 28, 8, 1),
            listOf(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)
        )
        assertEquals(expected, generatePascalsTriangle(numRows))
    }
}