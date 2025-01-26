package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArraySignTest {

    @Test
    fun `test with all positive numbers`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val result = arraySign(nums)
        assertEquals(1, result) // All positive numbers result in a positive product
    }

    @Test
    fun `test with a single negative number`() {
        val nums = intArrayOf(-1)
        val result = arraySign(nums)
        assertEquals(-1, result) // Single negative number results in a negative product
    }

    @Test
    fun `test with multiple negative numbers`() {
        val nums = intArrayOf(-1, -2, -3)
        val result = arraySign(nums)
        assertEquals(-1, result) // Odd count of negatives results in a negative product
    }

    @Test
    fun `test with even count of negative numbers`() {
        val nums = intArrayOf(-1, -2, 3, 4)
        val result = arraySign(nums)
        assertEquals(1, result) // Even count of negatives results in a positive product
    }

    @Test
    fun `test with a zero in the array`() {
        val nums = intArrayOf(1, 2, 0, -3)
        val result = arraySign(nums)
        assertEquals(0, result) // Zero in the array makes the product zero
    }

    @Test
    fun `test with all zeros`() {
        val nums = intArrayOf(0, 0, 0)
        val result = arraySign(nums)
        assertEquals(0, result) // All zeros result in a product of zero
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        val result = arraySign(nums)
        assertEquals(1, result) // No elements result in a neutral product (1)
    }
}
