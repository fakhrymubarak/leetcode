package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumArrayTest {

    @Test
    fun `test with a small array`() {
        val nums = intArrayOf(-2, 0, 3, -5, 2, -1)
        val numArray = NumArray(nums)

        assertEquals(1, numArray.sumRange(0, 2)) // -2 + 0 + 3 = 1
        assertEquals(-1, numArray.sumRange(2, 5)) // 3 + -5 + 2 + -1 = -1
        assertEquals(-3, numArray.sumRange(0, 5)) // -2 + 0 + 3 + -5 + 2 + -1 = -3
    }

    @Test
    fun `test with all positive numbers`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val numArray = NumArray(nums)

        assertEquals(15, numArray.sumRange(0, 4)) // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(12, numArray.sumRange(2, 4)) // 3 + 4 + 5 = 12
        assertEquals(3, numArray.sumRange(0, 1)) // 1 + 2 = 3
    }

    @Test
    fun `test with all negative numbers`() {
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val numArray = NumArray(nums)

        assertEquals(-15, numArray.sumRange(0, 4)) // -1 + -2 + -3 + -4 + -5 = -15
        assertEquals(-12, numArray.sumRange(2, 4)) // -3 + -4 + -5 = -12
        assertEquals(-3, numArray.sumRange(0, 1)) // -1 + -2 = -3
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(10)
        val numArray = NumArray(nums)

        assertEquals(10, numArray.sumRange(0, 0)) // Single element: 10
    }

    @Test
    fun `test with mixed positive and negative numbers`() {
        val nums = intArrayOf(1, -1, 2, -2, 3, -3)
        val numArray = NumArray(nums)

        assertEquals(0, numArray.sumRange(0, 5)) // 1 + -1 + 2 + -2 + 3 + -3 = 0
        assertEquals(2, numArray.sumRange(0, 2)) // 1 + -1 + 2 = 2
        assertEquals(-2, numArray.sumRange(3, 5)) // -2 + 3 + -3 = -2
    }

    @Test
    fun `test with range starting at zero`() {
        val nums = intArrayOf(4, -2, 5, 3, -1)
        val numArray = NumArray(nums)

        assertEquals(7, numArray.sumRange(0, 2)) // 4 + -2 + 5 = 7
    }

    @Test
    fun `test with range ending at last element`() {
        val nums = intArrayOf(1, 3, -2, 8, -7, 10)
        val numArray = NumArray(nums)

        assertEquals(11, numArray.sumRange(3, 5)) // 8 + -7 + 10 = 11
    }
}
