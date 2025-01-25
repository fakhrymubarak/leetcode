package org.fakhry.leetcode.two_pointers

/**
 * Moves all zeros in the given array to the end while maintaining the relative order of the non-zero elements.
 *
 * The function modifies the input array in-place, without using any additional space.
 *
 * @param nums The input array of integers.
 *
 * Time Complexity:
 * O(n^2) - In the worst case, each zero in the array causes all subsequent elements to be shifted, leading to quadratic behavior.
 *
 * Space Complexity:
 * O(1) - Operates directly on the input array without requiring additional memory.
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 */
fun moveZeroes(nums: IntArray) {
    var l = 0
    var r = nums.size - 1
    while (l < r) {
        if (nums[l] == 0) {
            for (i in l until r) {
                nums[i] = nums[i + 1]
            }
            nums[r] = 0
            r--
        } else {
            l++
        }
    }
}
