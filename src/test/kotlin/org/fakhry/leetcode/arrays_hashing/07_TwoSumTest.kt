package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun `test with typical case`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, twoSum(nums, target))
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-3, 4, 3, 90)
        val target = 0
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, twoSum(nums, target))
    }

    @Test
    fun `test with two elements only`() {
        val nums = intArrayOf(1, 2)
        val target = 3
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, twoSum(nums, target))
    }

    @Test
    fun `test with no solution`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val target = 10
        val expected = intArrayOf()
        assertArrayEquals(expected, twoSum(nums, target))
    }

    @Test
    fun `test with repeating elements`() {
        val nums = intArrayOf(3, 4, 3, 5)
        val target = 6
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, twoSum(nums, target))
    }

    @Test
    fun `test with large array`() {
        val nums = IntArray(10000) { it + 1 }
        val target = 19999
        val expected = intArrayOf(9998, 9999)
        assertArrayEquals(expected, twoSum(nums, target))
    }
}

class TwoSumOptimizedTest {

    @Test
    fun `test with typical case`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-3, 4, 3, 90)
        val target = 0
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }

    @Test
    fun `test with two elements only`() {
        val nums = intArrayOf(1, 2)
        val target = 3
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }

    @Test
    fun `test with no solution`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val target = 10
        val expected = intArrayOf()
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }

    @Test
    fun `test with repeating elements`() {
        val nums = intArrayOf(3, 4, 3, 5)
        val target = 6
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }

    @Test
    fun `test with large array`() {
        val nums = IntArray(10000) { it + 1 }
        val target = 19999
        val expected = intArrayOf(9998, 9999)
        assertArrayEquals(expected, twoSumOptimized(nums, target))
    }
}
