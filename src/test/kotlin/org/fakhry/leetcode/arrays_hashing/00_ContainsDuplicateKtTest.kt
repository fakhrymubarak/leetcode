package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainsDuplicateKtTest {

    @Test
    fun containsDuplicate_noDuplicate_returnFalse() {
        val nums = intArrayOf(1, 2, 3, 9, 5, 6)
        val result = containsDuplicate(nums)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun containsDuplicate_withDuplicate_returnTrue() {
        val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val result = containsDuplicate(nums)
        assertEquals(expected = true, actual = result)
    }

    @Test
    fun containsDuplicate2_noDuplicate_returnFalse() {
        val nums = intArrayOf(1, 2, 3, 9, 5, 6)
        val result = containsDuplicate2(nums)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun containsDuplicate2_withDuplicate_returnTrue() {
        val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val result = containsDuplicate2(nums)
        assertEquals(expected = true, actual = result)
    }
}