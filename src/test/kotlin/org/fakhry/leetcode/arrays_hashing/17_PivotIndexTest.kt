package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PivotIndexTest {

    @Test
    fun `test with a typical array`() {
        val nums = intArrayOf(1, 7, 3, 6, 5, 6)
        val result = pivotIndex(nums)
        assertEquals(3, result) // Pivot index is at 3 (left sum = 11, right sum = 11)
    }

    @Test
    fun `test with no pivot index`() {
        val nums = intArrayOf(1, 2, 3)
        val result = pivotIndex(nums)
        assertEquals(-1, result) // No pivot index exists
    }

    @Test
    fun `test with pivot at start`() {
        val nums = intArrayOf(0, 1, -1)
        val result = pivotIndex(nums)
        assertEquals(0, result) // Pivot index is at 0 (left sum = 0, right sum = 0)
    }

    @Test
    fun `test with pivot at end`() {
        val nums = intArrayOf(2, 1, -1)
        val result = pivotIndex(nums)
        assertEquals(0, result)
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(10)
        val result = pivotIndex(nums)
        assertEquals(0, result) // The single element is the pivot index
    }

    @Test
    fun `test with all elements zero`() {
        val nums = intArrayOf(0, 0, 0, 0)
        val result = pivotIndex(nums)
        assertEquals(0, result) // Any index could be a pivot, return the first
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-1, -1, -1, 0, 1, 1)
        val result = pivotIndex(nums)
        assertEquals(0, result)
    }
}

class PivotIndexOptimizedTest {

    @Test
    fun `test with a typical array`() {
        val nums = intArrayOf(1, 7, 3, 6, 5, 6)
        val result = pivotIndexOptimized(nums)
        assertEquals(3, result) // Pivot index is at 3 (left sum = 11, right sum = 11)
    }

    @Test
    fun `test with no pivot index`() {
        val nums = intArrayOf(1, 2, 3)
        val result = pivotIndexOptimized(nums)
        assertEquals(-1, result) // No pivot index exists
    }

    @Test
    fun `test with pivot at start`() {
        val nums = intArrayOf(0, 1, -1)
        val result = pivotIndexOptimized(nums)
        assertEquals(0, result) // Pivot index is at 0 (left sum = 0, right sum = 0)
    }

    @Test
    fun `test with pivot at end`() {
        val nums = intArrayOf(2, 1, -1)
        val result = pivotIndexOptimized(nums)
        assertEquals(0, result)
    }

    @Test
    fun `test with single element array`() {
        val nums = intArrayOf(10)
        val result = pivotIndexOptimized(nums)
        assertEquals(0, result) // The single element is the pivot index
    }

    @Test
    fun `test with all elements zero`() {
        val nums = intArrayOf(0, 0, 0, 0)
        val result = pivotIndexOptimized(nums)
        assertEquals(0, result) // Any index could be a pivot, return the first
    }

    @Test
    fun `test with negative numbers`() {
        val nums = intArrayOf(-1, -1, -1, 0, 1, 1)
        val result = pivotIndexOptimized(nums)
        assertEquals(0, result)
    }
}
