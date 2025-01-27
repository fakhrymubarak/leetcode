package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TopKFrequentTest {

    @Test
    fun `test with multiple frequencies`() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val k = 2
        val result = topKFrequent(nums, k)
        assertArrayEquals(intArrayOf(1, 2), result) // 1 has the highest frequency, followed by 2
    }

    @Test
    fun `test with single element`() {
        val nums = intArrayOf(1)
        val k = 1
        val result = topKFrequent(nums, k)
        assertArrayEquals(intArrayOf(1), result) // Single element is the only frequent element
    }

    @Test
    fun `test with k equal to array size`() {
        val nums = intArrayOf(1, 1, 2, 2, 3, 3, 4)
        val k = 4
        val result = topKFrequent(nums, k)
        assertArrayEquals(intArrayOf(1, 2, 3, 4).sortedArray(), result.sortedArray()) // All elements appear
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-1, -1, -2, -2, -2, 3)
        val k = 2
        val result = topKFrequent(nums, k)
        assertArrayEquals(intArrayOf(-2, -1), result) // -2 has the highest frequency, followed by -1
    }
}
