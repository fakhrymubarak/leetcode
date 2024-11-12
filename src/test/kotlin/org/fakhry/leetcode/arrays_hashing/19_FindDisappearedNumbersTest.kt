package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindDisappearedNumbersTest {

    @Test
    fun `test with missing numbers`() {
        val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val result = findDisappearedNumbers(nums)
        assertEquals(listOf(5, 6), result) // Missing numbers are 5 and 6
    }

    @Test
    fun `test with no missing numbers`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = findDisappearedNumbers(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with all missing numbers`() {
        val nums = intArrayOf(2, 2, 2, 2)
        val result = findDisappearedNumbers(nums)
        assertEquals(listOf(1, 3, 4), result) // Numbers 1, 3, and 4 are missing
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(1)
        val result = findDisappearedNumbers(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with single missing number`() {
        val nums = intArrayOf(2, 2)
        val result = findDisappearedNumbers(nums)
        assertEquals(listOf(1), result) // Number 1 is missing
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        val result = findDisappearedNumbers(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with large array`() {
        val nums = (1..10000).toList().toIntArray().apply { this[9999] = 1 } // Replace last element with a duplicate
        val result = findDisappearedNumbers(nums)
        assertEquals(listOf(10000), result) // Only 10000 is missing
    }
}

class FindDisappearedNumbersOptimizedTest {

    @Test
    fun `test with missing numbers`() {
        val nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(listOf(5, 6), result) // Missing numbers are 5 and 6
    }

    @Test
    fun `test with no missing numbers`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with all missing numbers`() {
        val nums = intArrayOf(2, 2, 2, 2)
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(listOf(1, 3, 4), result) // Numbers 1, 3, and 4 are missing
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(1)
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with single missing number`() {
        val nums = intArrayOf(2, 2)
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(listOf(1), result) // Number 1 is missing
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(emptyList<Int>(), result) // No numbers are missing
    }

    @Test
    fun `test with large array`() {
        val nums = (1..10000).toList().toIntArray().apply { this[9999] = 1 } // Replace last element with a duplicate
        val result = findDisappearedNumbersOptimized(nums)
        assertEquals(listOf(10000), result) // Only 10000 is missing
    }
}
