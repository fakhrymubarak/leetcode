package org.fakhry.leetcode.arrays_hashing

/**
 * Determines if the input array can be made non-decreasing by modifying at most one element.
 *
 * The function iterates through the array, checking for violations of the non-decreasing property.
 * When a violation is found, it modifies either the current element or the previous one to fix the issue,
 * ensuring at most one modification is made. If more than one modification is needed, the function returns false.
 *
 * Time Complexity:
 * O(n) - Iterates through the array once.
 *
 * Space Complexity:
 * O(1) - Modifies the input array in-place without requiring additional space.
 *
 * @see <a href="https://leetcode.com/problems/non-decreasing-array/">Non-decreasing Array</a>
 */
fun checkPossibility(nums: IntArray): Boolean {
    var isModified = false

    for (i in 1 until nums.size) {
        if (nums[i - 1] > nums[i]) {
            if (isModified) return false

            if (i == 1 || nums[i] >= nums[i - 2]) {
                nums[i - 1] = nums[i] // Modify nums[i-1]
            } else {
                nums[i] = nums[i - 1] // Modify nums[i]
            }
            isModified = true
        }
    }
    return true
}

