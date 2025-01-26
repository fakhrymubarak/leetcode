package org.fakhry.leetcode.two_pointers

/**
 * Finds two numbers in a sorted array such that their sum equals the given target.
 * Returns the 1-based indices of the two numbers.
 *
 * Assumes the input array is sorted in ascending order.
 * If no such pair exists, returns an array with two zeros.
 *
 * Time Complexity:
 * O(n) - The array is traversed at most once using the two-pointer approach.
 *
 * Space Complexity:
 * O(1) - Uses constant space, as the operation is performed in-place.
 *
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Two Sum II - Input Array Is Sorted</a>
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    var l = 0
    var r = nums.size - 1
    while (l < r) {
        val sum = nums[l] + nums[r]
        if (sum == target) return intArrayOf(l + 1, r + 1)

        if (sum < target) l++ else r--
    }

    return intArrayOf(0, 0)
}
