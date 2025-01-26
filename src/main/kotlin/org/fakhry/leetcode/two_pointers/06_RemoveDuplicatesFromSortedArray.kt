package org.fakhry.leetcode.two_pointers

/**
 * Removes duplicates from a sorted array in-place such that each unique element appears only once.
 * The relative order of the elements is preserved, and the function returns the number of unique elements.
 *
 * The input array `nums` is modified in-place to store the unique elements in the first part of the array.
 *
 * @param nums The input sorted array from which duplicates are to be removed.
 * @return The number of unique elements in the array after removing duplicates.
 *
 * Time Complexity:
 * O(n) - Iterates through the array once, where `n` is the size of the input array.
 *
 * Space Complexity:
 * O(1) - No additional space is used, as the operation is performed in-place.
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a>
 */
fun removeDuplicates(nums: IntArray): Int {
    var j = 0
    for (i in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            j++
            nums[j] = nums[i]
        }
    }

    return j + 1
}