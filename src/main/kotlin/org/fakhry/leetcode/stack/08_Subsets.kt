package org.fakhry.leetcode.stack

/**
 * Generates all possible subsets of a given array of distinct integers.
 *
 * This function uses backtracking to explore all subset possibilities:
 * - Each element can either be included in a subset or excluded.
 * - Recursively explores both choices until all subsets are generated.
 *
 * Time Complexity:
 * O(2^n) - Since each element has two choices (include/exclude), there are 2^n subsets.
 *
 * Space Complexity:
 * O(n) - Maximum recursion depth is `n`, and the stack maintains subsets of size at most `n`.
 *
 * @see <a href="https://leetcode.com/problems/subsets/">Subsets</a>
 */
fun subsets(nums: IntArray): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    val stack = mutableListOf<Int>()

    fun backtrack(i: Int) {
        if (i == nums.size) {
            res.add(ArrayList(stack)) // Store a copy of the current subset
            return
        }

        // Decision to include nums[i]
        stack.add(nums[i])
        backtrack(i + 1)

        // Decision to not include nums[i]
        stack.removeAt(stack.size - 1)
        backtrack(i + 1)
    }

    backtrack(0)
    return res
}
