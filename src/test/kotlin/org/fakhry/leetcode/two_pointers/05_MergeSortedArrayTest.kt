package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    @Test
    fun `test with equal size arrays`() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)
        val m = 3
        val n = 3
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
    }

    @Test
    fun `test with nums1 having no initial elements`() {
        val nums1 = intArrayOf(0, 0, 0)
        val nums2 = intArrayOf(1, 2, 3)
        val m = 0
        val n = 3
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3), nums1)
    }

    @Test
    fun `test with nums2 having no elements`() {
        val nums1 = intArrayOf(1, 2, 3)
        val nums2 = intArrayOf()
        val m = 3
        val n = 0
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3), nums1)
    }

    @Test
    fun `test with nums1 and nums2 having one element each`() {
        val nums1 = intArrayOf(1, 0)
        val nums2 = intArrayOf(2)
        val m = 1
        val n = 1
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2), nums1)
    }

    @Test
    fun `test with nums2 elements smaller than nums1`() {
        val nums1 = intArrayOf(3, 4, 5, 0, 0, 0)
        val nums2 = intArrayOf(1, 2, 3)
        val m = 3
        val n = 3
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3, 3, 4, 5), nums1)
    }

    @Test
    fun `test with nums1 elements larger than nums2`() {
        val nums1 = intArrayOf(6, 7, 8, 0, 0, 0)
        val nums2 = intArrayOf(1, 2, 3)
        val m = 3
        val n = 3
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3, 6, 7, 8), nums1)
    }

    @Test
    fun `test with overlapping elements in nums1 and nums2`() {
        val nums1 = intArrayOf(1, 3, 5, 0, 0, 0)
        val nums2 = intArrayOf(2, 4, 6)
        val m = 3
        val n = 3
        merge(nums1, m, nums2, n)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5, 6), nums1)
    }
}

