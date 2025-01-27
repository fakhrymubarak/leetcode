package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckPossibilityTest {

    @Test
    fun `test array that is already non-decreasing`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = checkPossibility(nums)
        assertEquals(true, result) // No modification needed
    }

    @Test
    fun `test array that can be fixed with one modification`() {
        val nums = intArrayOf(4, 2, 3)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Modify nums[0] to 2
    }

    @Test
    fun `test array requiring more than one modification`() {
        val nums = intArrayOf(4, 2, 1)
        val result = checkPossibility(nums)
        assertEquals(false, result) // Cannot be fixed with one modification
    }

    @Test
    fun `test array with edge case modification at the end`() {
        val nums = intArrayOf(1, 2, 5, 3, 6)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Modify nums[3] to 5
    }

    @Test
    fun `test array with modification at the beginning`() {
        val nums = intArrayOf(3, 1, 2, 3)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Modify nums[0] to 1
    }

    @Test
    fun `test array with all identical elements`() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Already non-decreasing
    }

    @Test
    fun `test array with negative numbers`() {
        val nums = intArrayOf(-1, 4, 2, 3)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Modify nums[1] to 2
    }

    @Test
    fun `test array with single element`() {
        val nums = intArrayOf(10)
        val result = checkPossibility(nums)
        assertEquals(true, result) // Single element is always non-decreasing
    }

    @Test
    fun `test empty array`() {
        val nums = intArrayOf()
        val result = checkPossibility(nums)
        assertEquals(true, result) // Empty array is non-decreasing
    }
}
