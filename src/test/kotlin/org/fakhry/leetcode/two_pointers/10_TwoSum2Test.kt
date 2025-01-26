package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun `test with valid pair`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(1, 2), result) // 2 + 7 = 9
    }

    @Test
    fun `test with no valid pair`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val target = 10
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(0, 0), result) // No pair adds up to 10
    }

    @Test
    fun `test with multiple valid pairs`() {
        val nums = intArrayOf(1, 2, 3, 4, 6)
        val target = 7
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(1, 5), result) // 2 + 5 = 7
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-10, -3, 2, 4, 8)
        val target = -1
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(2, 3), result) // -3 + 2 = -1
    }

    @Test
    fun `test with smallest array`() {
        val nums = intArrayOf(1, 2)
        val target = 3
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(1, 2), result) // 1 + 2 = 3
    }

    @Test
    fun `test with large numbers`() {
        val nums = intArrayOf(1000, 2000, 3000, 4000, 5000)
        val target = 7000
        val result = twoSum(nums, target)
        assertArrayEquals(intArrayOf(2, 5), result) // 2000 + 5000 = 7000
    }
}
