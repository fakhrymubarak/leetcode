package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MoveZeroesTest {

    @Test
    fun `test with array containing multiple zeros`() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), nums)
    }

    @Test
    fun `test with array containing no zeros`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), nums)
    }

    @Test
    fun `test with array containing all zeros`() {
        val nums = intArrayOf(0, 0, 0, 0, 0)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(0, 0, 0, 0, 0), nums)
    }

    @Test
    fun `test with empty array`() {
        val nums = intArrayOf()
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(), nums)
    }

    @Test
    fun `test with single element array - non-zero`() {
        val nums = intArrayOf(1)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(1), nums)
    }

    @Test
    fun `test with single element array - zero`() {
        val nums = intArrayOf(0)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(0), nums)
    }

    @Test
    fun `test with zeros at the end of the array`() {
        val nums = intArrayOf(1, 2, 3, 0, 0)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 0, 0), nums)
    }

    @Test
    fun `test with zeros at the beginning of the array`() {
        val nums = intArrayOf(0, 0, 1, 2, 3)
        moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3, 0, 0), nums)
    }
}

