package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - Iterates through the array once to calculate the total sum and once to find the pivot index.
 *
 * Space Complexity:
 * O(1) - Uses only a constant amount of extra space for variables `leftSum` and `rightSum`.
 *
 * @see <a href="https://leetcode.com/problems/find-pivot-index/">Find Pivot Index</a>
 */
fun pivotIndex(nums: IntArray): Int {
    var leftSum = 0
    var rightSum = nums.sum()

    for (i in nums.indices) {
        rightSum -= nums[i]
        if (rightSum == leftSum) return i
        leftSum += nums[i]
    }

    return -1
}

fun pivotIndexOptimized(nums: IntArray): Int {
    var leftSum = 0
    var rightSum = 0

    for (i in 1 until nums.size) {
        rightSum += nums[i]
    }

    if (rightSum == 0) return 0

    for (i in 1 until nums.size) {
        rightSum -= nums[i]
        leftSum += nums[i - 1]
        if (rightSum == leftSum) return i
    }

    return -1
}
