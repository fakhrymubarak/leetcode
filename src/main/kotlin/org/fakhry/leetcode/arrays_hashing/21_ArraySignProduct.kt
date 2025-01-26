package org.fakhry.leetcode.arrays_hashing

/**
 * Determines the sign of the product of an array of integers without calculating the actual product.
 *
 * Returns:
 * - `1` if the product of the array is positive.
 * - `-1` if the product of the array is negative.
 * - `0` if any element in the array is `0` (as the product will be zero).
 *
 * Time Complexity:
 * O(n) - Iterates through the array once, where `n` is the size of the input array.
 *
 * Space Complexity:
 * O(1) - Uses constant space as no additional data structures are used.
 *
 * @see <a href="https://leetcode.com/problems/sign-of-the-product-of-an-array/">Sign of the Product of an Array</a>
 */
fun arraySign(nums: IntArray): Int {
    var res = 1
    for (num in nums) {
        if (num < 0) {
            res *= -1
        } else if (num == 0) {
            return 0
        }
    }
    return res
}
