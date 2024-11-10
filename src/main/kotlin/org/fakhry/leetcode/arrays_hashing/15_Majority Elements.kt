package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - Iterates through the array once to find the majority element.
 *
 * Space Complexity:
 * O(1) - Uses constant space for variables `votes` and `candidate`.
 *
 * @see <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 */
fun majorityElement(nums: IntArray): Int {
    val majorityThreshold = nums.size / 2
    var counter = 0
    var element = -1

    for (i in nums.indices) {
        if (counter == 0) {
            element = nums[i]
            counter++
        } else if (nums[i] == element) {
            counter++
        } else {
            counter--
        }

        if (counter > majorityThreshold) return element
    }

    return element
}
