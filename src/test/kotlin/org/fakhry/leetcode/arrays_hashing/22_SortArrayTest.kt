package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortArrayTest {

    @Test
    fun `test with random elements`() {
        val nums = intArrayOf(5, 2, 9, 1, 5, 6)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(1, 2, 5, 5, 6, 9), sorted)
    }

    @Test
    fun `test with already sorted array`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sorted)
    }

    @Test
    fun `test with reverse sorted array`() {
        val nums = intArrayOf(5, 4, 3, 2, 1)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sorted)
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(42)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(42), sorted)
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(), sorted)
    }

    @Test
    fun `test with duplicate elements`() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(2, 2, 2, 2, 2), sorted)
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-1, -3, -2, 0, 1)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(-3, -2, -1, 0, 1), sorted)
    }

    @Test
    fun `test with large array`() {
        val nums = intArrayOf(1000, -1, 200, 5, 0, 2, 3, 1, -5, 7)
        val sorted = sortArray(nums)
        assertArrayEquals(intArrayOf(-5, -1, 0, 1, 2, 3, 5, 7, 200, 1000), sorted)
    }
}
