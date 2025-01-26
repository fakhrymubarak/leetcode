package org.fakhry.leetcode.two_pointers

/**
 * Finds the minimum possible difference between the highest and lowest scores among any `k` students.
 *
 * Time Complexity:
 * O(n log n) - The array is sorted, which takes O(n log n), and the sliding window iteration takes O(n).
 *
 * Space Complexity:
 * O(1) - No additional space is used apart from variables.
 *
 * @see <a href="https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/">Minimum Difference Between Highest and Lowest of K Scores</a>
 */
fun minimumDifference(nums: IntArray, k: Int): Int {
    if (k == 1) return 0
    nums.sort()

    var minDiff = -1

    for (i in nums.indices) {
        val tpMinDiff = nums[i + k - 1] - nums[i]

        if (tpMinDiff < minDiff || minDiff == -1) minDiff = tpMinDiff
        if (i + k == nums.size) return minDiff
    }
    return minDiff
}
