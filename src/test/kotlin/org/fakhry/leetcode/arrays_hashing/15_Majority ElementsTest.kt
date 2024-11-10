package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementTest {

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(1)
        val result = majorityElement(nums)
        assertEquals(1, result)
    }

    @Test
    fun `test with all elements the same`() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val result = majorityElement(nums)
        assertEquals(2, result)
    }

    @Test
    fun `test with a typical majority element`() {
        val nums = intArrayOf(3, 3, 4, 2, 3, 3, 3)
        val result = majorityElement(nums)
        assertEquals(3, result)
    }

    @Test
    fun `test with majority element at the start`() {
        val nums = intArrayOf(1, 1, 1, 2, 3, 4, 1)
        val result = majorityElement(nums)
        assertEquals(1, result)
    }

    @Test
    fun `test with majority element at the end`() {
        val nums = intArrayOf(2, 3, 4, 5, 6, 6, 6, 6)
        val result = majorityElement(nums)
        assertEquals(6, result)
    }

    @Test
    fun `test with evenly distributed elements`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 2, 1)
        val result = majorityElement(nums)
        assertEquals(1, result)
    }

    @Test
    fun `test with large input`() {
        val nums = IntArray(1000) { 1 }
        nums[500] = 2
        val result = majorityElement(nums)
        assertEquals(1, result)
    }
}
