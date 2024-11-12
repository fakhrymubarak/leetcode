package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - Iterates through the array twice: once to populate the set and once to remove numbers.
 *
 * Space Complexity:
 * O(n) - Uses a set to store all numbers in the range [1, n].
 *
 * @see <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">Find All Numbers Disappeared in an Array</a>
 */
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val mutableList = mutableSetOf<Int>().apply {
        for (i in 1 until nums.size + 1) add(i)
    }
    for (i in nums.indices) {
        mutableList.remove(nums[i])
    }

    return mutableList.toList()
}

/**
 * Time Complexity:
 * O(n) - Iterates through the array twice: once to mark numbers as visited and once to find missing numbers.
 *
 * Space Complexity:
 * O(1) - Uses constant extra space by modifying the input array in place.
 */
fun findDisappearedNumbersOptimized(nums: IntArray): List<Int> {
    for (i in nums.indices) {
        val index = kotlin.math.abs(nums[i]) - 1
        if (nums[index] > 0) {
            nums[index] = -nums[index]
        }
    }

    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] > 0) {
            result.add(i + 1)
        }
    }

    return result
}


