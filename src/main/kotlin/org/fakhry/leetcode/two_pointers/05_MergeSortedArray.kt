package org.fakhry.leetcode.two_pointers

/**
 * Merges two sorted arrays, `nums1` and `nums2`, into a single sorted array in-place.
 *
 * The `nums1` array has a size of `m + n`, where the first `m` elements represent the sorted elements
 * and the remaining `n` elements are empty (set to 0) and serve as space for merging.
 * The `nums2` array has `n` sorted elements to be merged into `nums1`.
 *
 * @param nums1 The first sorted array, with additional space at the end for merging.
 * @param m The number of valid elements in `nums1`.
 * @param nums2 The second sorted array.
 * @param n The number of elements in `nums2`.
 *
 * Time Complexity:
 * O(m + n) - Iterates through both arrays once to merge them.
 *
 * Space Complexity:
 * O(1) - Merges in-place without using any additional memory.
 *
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">Merge Sorted Array</a>
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    if (n == 0) return
    if (m == 0) {
        for (i in nums2.indices) {
            nums1[i] = nums2[i]
        }
        return
    }

    var p1 = m - 1
    var p2 = n - 1
    for (i in (m + n - 1) downTo 0) {
        if (p2 == -1) return
        if (p1 == -1) {
            nums1[i] = nums2[p2]
            p2--
            continue
        }
        if (nums1[p1] > nums2[p2]) {
            nums1[i] = nums1[p1]
            p1--
        } else {
            nums1[i] = nums2[p2]
            p2--
        }
    }
}
