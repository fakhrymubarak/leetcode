package org.fakhry.leetcode.two_pointers

/**
 * Removes duplicates from a sorted array in-place such that each unique element can appear at most twice.
 * The relative order of the elements is preserved, and the function returns the number of valid elements.
 *
 * The input array `nums` is modified in-place to store the valid elements in the first part of the array.
 *
 * Time Complexity:
 * O(n) - Iterates through the array once, where `n` is the size of the input array.
 *
 * Space Complexity:
 * O(1) - No additional space is used, as the operation is performed in-place.
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">Remove Duplicates from Sorted Array II</a>
 */
fun removeDuplicates2(nums: IntArray): Int {
    var j = 0
    var hitTwice = false
    for (i in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            j++
            nums[j] = nums[i]
            hitTwice = false
        } else {
            if (!hitTwice) {
                j++
                nums[j] = nums[i]
                hitTwice = true
            }
        }
    }

    return j + 1
}