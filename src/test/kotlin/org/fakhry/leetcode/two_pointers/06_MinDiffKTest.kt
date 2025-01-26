package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDifferenceTest {

    @Test
    fun `test with single student`() {
        val nums = intArrayOf(90)
        val k = 1
        val result = minimumDifference(nums, k)
        assertEquals(0, result) // Only one student, so the difference is 0.
    }

    @Test
    fun `test with multiple students and k = 2`() {
        val nums = intArrayOf(9, 4, 1, 7)
        val k = 2
        val result = minimumDifference(nums, k)
        assertEquals(2, result) // Minimum difference between any 2 students is 2.
    }

    @Test
    fun `test with large numbers and k = 6`() {
        val nums = intArrayOf(87063, 61094, 44530, 21297, 95857, 93551, 9918)
        val k = 6
        val result = minimumDifference(nums, k)
        assertEquals(74560, result)
    }

    @Test
    fun `test with consecutive integers`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 3
        val result = minimumDifference(nums, k)
        assertEquals(2, result) // Consecutive numbers, smallest range for k = 3 is 2.
    }

    @Test
    fun `test with all elements equal`() {
        val nums = intArrayOf(5, 5, 5, 5, 5)
        val k = 3
        val result = minimumDifference(nums, k)
        assertEquals(0, result) // All elements are the same, so the difference is 0.
    }

    @Test
    fun `test with large array and k = array size`() {
        val nums = intArrayOf(100, 200, 300, 400, 500)
        val k = 5
        val result = minimumDifference(nums, k)
        assertEquals(400, result) // The difference is between the smallest and largest elements.
    }

    @Test
    fun `test with array containing negative numbers`() {
        val nums = intArrayOf(-10, -20, -30, -40, -50)
        val k = 3
        val result = minimumDifference(nums, k)
        assertEquals(20, result) // Smallest range for k = 3 is 20.
    }
}
