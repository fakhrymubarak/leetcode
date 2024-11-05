package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n^2) - iterates through each element and checks if the complement exists in the array using `contains` and `indexOf`,
 * which have O(n) time complexity each. Thus, the worst case is O(n * n).
 *
 * Space Complexity :
 * O(1) - no additional data structures are used except for the output array.
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.size == 2) return intArrayOf(0, 1)
    nums.forEachIndexed { index, value ->
        val pairedElements = target - value

        if (nums.contains(pairedElements) && nums.lastIndexOf(pairedElements) != index) {
            return intArrayOf(index, nums.lastIndexOf(pairedElements))
        }
    }

    return intArrayOf()
}


/**
 * Time Complexity :
 * O(n) - iterates through the array once, performing constant-time operations for each element with the hash map.
 *
 * Space Complexity :
 * O(n) - uses additional space for the hash map to store up to `n` elements.
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
fun twoSumOptimized(nums: IntArray, target: Int): IntArray {
    val numToIndex = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, value ->
        val pairedElements = target - value
        if (numToIndex.contains(pairedElements)) {
            return intArrayOf(numToIndex[pairedElements]!!, index)
        }
        numToIndex[value] = index
    }

    return intArrayOf()
}
