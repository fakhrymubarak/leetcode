package org.fakhry.leetcode.arrays_hashing

/**
 * Sorts an array of integers using the merge sort algorithm.
 * The array is recursively divided into halves, and the sorted sub-arrays are merged back together.
 *
 * Time Complexity:
 * O(n log n) - The array is divided into halves log(n) times, and each merge operation takes O(n).
 *
 * Space Complexity:
 * O(n) - Additional space is used for temporary arrays during the merge process.
 *
 * @see <a href="https://leetcode.com/problems/sort-an-array">Sort an Array</a>
 */
fun sortArray(nums: IntArray): IntArray {
    val size = nums.size

    // If size is 1 ro empty return its value.
    if (size <= 1) return nums

    // Halving Array
    val mid = size / 2
    val left = sortArray(nums.copyOfRange(0, mid))
    val right = sortArray(nums.copyOfRange(mid, size))

    return mergeSorted(left, right)
}

/**
 * Merges two sorted arrays into a single sorted array.
 *
 * Time Complexity:
 * O(n) - Merges two arrays of combined size n in linear time.
 *
 * Space Complexity:
 * O(n) - The merged array uses additional space of size n.
 */
private fun mergeSorted(nums1: IntArray, nums2: IntArray): IntArray {
    val result = IntArray(nums1.size + nums2.size)
    var r = 0
    var n1 = 0
    var n2 = 0

    while (n1 < nums1.size && n2 < nums2.size) {
        if (nums1[n1] <= nums2[n2]) {
            result[r++] = nums1[n1++]
        } else {
            result[r++] = nums2[n2++]
        }
    }

    while (n1 < nums1.size) {
        result[r++] = nums1[n1++]
    }

    while (n2 < nums2.size) {
        result[r++] = nums2[n2++]
    }

    return result
}
