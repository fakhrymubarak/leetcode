package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * - Constructor: O(n) - Precomputes the prefix sum array by iterating through the input array once.
 * - sumRange: O(1) - Computes the range sum using precomputed values.
 *
 * Space Complexity:
 * O(1) - Modifies the input array in place without using extra memory.
 *
 * @see <a href="https://leetcode.com/problems/range-sum-query-immutable/">Range Sum Query - Immutable</a>
 */
class NumArray(private val nums: IntArray) {

    init {
        for (i in nums.indices) {
            if (i != 0) {
                nums[i] = nums[i] + nums[i - 1]
            }
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        val result = if (left == 0) {
            nums[right]
        } else {
            nums[right] - nums[left - 1]
        }
        return result
    }
}
