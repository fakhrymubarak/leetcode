package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveElementTest {

    @Test
    fun `test with values to remove`() {
        val nums = intArrayOf(3, 2, 2, 3)
        val `val` = 3
        val result = removeElement(nums, `val`)
        assertEquals(2, result)
        assertEquals(listOf(2, 2), nums.slice(0 until result))
    }

    @Test
    fun `test with no values to remove`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val `val` = 5
        val result = removeElement(nums, `val`)
        assertEquals(4, result)
        assertEquals(listOf(1, 2, 3, 4), nums.slice(0 until result))
    }

    @Test
    fun `test with all values to remove`() {
        val nums = intArrayOf(1, 1, 1, 1)
        val `val` = 1
        val result = removeElement(nums, `val`)
        assertEquals(0, result)
        assertEquals(emptyList<Int>(), nums.slice(0 until result))
    }

    @Test
    fun `test with mixed values`() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val `val` = 2
        val result = removeElement(nums, `val`)
        assertEquals(5, result)
        assertEquals(listOf(0, 1, 3, 0, 4), nums.slice(0 until result))
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        val `val` = 1
        val result = removeElement(nums, `val`)
        assertEquals(0, result)
        assertEquals(emptyList<Int>(), nums.slice(0 until result))
    }

    @Test
    fun `test with single element array that matches val`() {
        val nums = intArrayOf(1)
        val `val` = 1
        val result = removeElement(nums, `val`)
        assertEquals(0, result)
        assertEquals(emptyList<Int>(), nums.slice(0 until result))
    }

    @Test
    fun `test with single element array that does not match val`() {
        val nums = intArrayOf(1)
        val `val` = 2
        val result = removeElement(nums, `val`)
        assertEquals(1, result)
        assertEquals(listOf(1), nums.slice(0 until result))
    }
}
