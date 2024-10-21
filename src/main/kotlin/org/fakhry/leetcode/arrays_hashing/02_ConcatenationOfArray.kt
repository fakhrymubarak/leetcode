package org.fakhry.leetcode.arrays_hashing

/**
 * Intuition :
 * To concatenate an array with itself, we need to create a new array that
 * has double the size of the original array and fill it with two copies of
 * the original array's elements—one after the other.
 *
 *
 * Approach :
 * - Create array with double size
 * - Iterate each element and assign it to index & nums size + index
 *
 * Time Complexity :
 * O(n) - iterate once for both strings
 *
 * Space Complexity :
 * O(2n) - create array with double size
 *
 * @see <a href="https://leetcode.com/problems/concatenation-of-array/">Concatenation of Array</a>
 * */
fun getConcatenation(nums: IntArray): IntArray {
    val ans = IntArray(2 * nums.size)
    nums.forEachIndexed { index, value ->
        ans[index] = value
        ans[nums.size + index] = value
    }
    return ans
}
