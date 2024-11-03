package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n^2) - for each element, iterates over the remaining elements to find the maximum.
 *
 * Space Complexity :
 * O(n) - creates a new array of the same size as the input.
 *
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Replace Elements with Greatest Element on Right Side</a>
 */
fun replaceElements(arr: IntArray): IntArray {
    if (arr.isEmpty()) return intArrayOf()

    val ans = IntArray(arr.size)
    arr.forEachIndexed { index, _ ->
        for (index2 in (index + 1) until arr.size) {
            if (arr[index2] > ans[index]) ans[index] = arr[index2]
        }
        if (index == arr.size - 1) ans[index] = -1
    }
    return ans
}

/**
 * Time Complexity :
 * O(n) - iterates through the array once from right to left.
 *
 * Space Complexity :
 * O(1) - modifies the input array in place without using additional space.
 *
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Replace Elements with Greatest Element on Right Side</a>
 */
fun replaceElementsFinal(arr: IntArray): IntArray {
    if (arr.isEmpty()) return arr else if (arr.size == 1) return intArrayOf(-1)

    var maxRight = -1
    for (i in arr.size - 1 downTo 0) {
        val newMax = maxOf(maxRight, arr[i])
        arr[i] = maxRight
        maxRight = newMax
    }
    return arr
}