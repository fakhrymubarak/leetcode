package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - Iterates through the array once, processing each element.
 *
 * Space Complexity:
 * O(1) - Modifies the array in place without using extra memory.

 * @see <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 *
 * Most shi**y problems description in leetcode!
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var counter = 0
    nums.forEachIndexed { index, value ->
        if (value != `val`) {
            nums[counter] = nums[index]
            counter++
        }
    }
    return counter
}
