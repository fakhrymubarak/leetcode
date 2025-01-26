package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicates2Test {

    @Test
    fun `test with array containing duplicates exceeding twice`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val result = removeDuplicates2(nums)
        assertEquals(5, result) // Array should now have 5 valid elements
        assertArrayEquals(intArrayOf(1, 1, 2, 2, 3), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with array having no duplicates`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = removeDuplicates2(nums)
        assertEquals(5, result) // Array remains unchanged
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with array having all identical elements`() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val result = removeDuplicates2(nums)
        assertEquals(2, result) // Only two of the same value are allowed
        assertArrayEquals(intArrayOf(1, 1), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(1)
        val result = removeDuplicates2(nums)
        assertEquals(1, result) // Single element remains
        assertArrayEquals(intArrayOf(1), nums.sliceArray(0 until result))
    }

    @Test
    fun `test with array having duplicates at the end`() {
        val nums = intArrayOf(1, 2, 2, 3, 3, 3, 3)
        val result = removeDuplicates2(nums)
        assertEquals(5, result) // Array should allow only up to two duplicates
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 3), nums.sliceArray(0 until result))
    }
}
