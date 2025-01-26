package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesTest {

    @Test
    fun `test with multiple duplicates`() {
        val nums = intArrayOf(1, 1, 2, 2, 3, 3, 3, 4, 4, 5)
        val result = removeDuplicates(nums)
        assertEquals(5, result) // Number of unique elements
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with no duplicates`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = removeDuplicates(nums)
        assertEquals(5, result) // Number of unique elements
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with all duplicates`() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val result = removeDuplicates(nums)
        assertEquals(1, result) // Only one unique element
        assertArrayEquals(intArrayOf(1), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(1)
        val result = removeDuplicates(nums)
        assertEquals(1, result) // Single element remains unique
        assertArrayEquals(intArrayOf(1), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with long array of consecutive numbers`() {
        val nums = intArrayOf(1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8)
        val result = removeDuplicates(nums)
        assertEquals(8, result) // Number of unique elements
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), nums.sliceArray(0 until result))
    }
}
