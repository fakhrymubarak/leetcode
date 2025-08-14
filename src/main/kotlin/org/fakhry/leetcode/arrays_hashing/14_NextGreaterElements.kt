package org.fakhry.leetcode.arrays_hashing

import java.util.*
import kotlin.collections.HashMap

/**
 * Time Complexity:
 * O(n + m) - where `n` is the size of `nums1` and `m` is the size of `nums2`.
 * The construction of the `greaterMap` is O(m), and updating `nums1` takes O(n).
 *
 * Space Complexity:
 * O(m) - The hash map stores up to `m` key-value pairs for `nums2`.
 *
 * @see <a href="https://leetcode.com/problems/next-greater-element-i/">Next Greater Element I</a>
 */
fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    if (nums2.size == 1) return intArrayOf(-1)
    val greaterMap = hashMapOf<Int, Int>()

    for (i in nums2.size - 1 downTo 0) {
        if (i == nums2.size - 1) {
            greaterMap[nums2[i]] = -1
        } else {
            val key = nums2[i + 1]
            if (nums2[i] < nums2[i + 1]) {
                greaterMap[nums2[i]] = key
            } else {
                greaterMap[nums2[i]] = greaterMap.findGreaterReference(key, nums2[i])
            }
        }
    }

    for (i in nums1.indices) {
        nums1[i] = greaterMap[nums1[i]] ?: -1
    }

    return nums1
}

private fun HashMap<Int, Int>.findGreaterReference(startKey: Int, currentValue: Int): Int {
    var currentKey = startKey
    var nextValue = this[currentKey]

    while (nextValue != null) {
        currentKey = nextValue
        if (currentKey > currentValue) break
        nextValue = this[currentKey]
    }

    return if (currentKey != startKey) currentKey else -1
}

/**
 * Time Complexity:
 * O(n + m) - where `n` is the size of `nums1` and `m` is the size of `nums2`.
 * - Building the map takes O(n).
 * - Traversing `nums2` takes O(m), with each element pushed/popped from the stack once.
 *
 * Space Complexity:
 * O(m) - Uses a stack to store elements and a map to store indices, with the stack holding at most `m` elements.
 *
 */
fun nextGreaterElementWithStack(nums1: IntArray, nums2: IntArray): IntArray {
    val stack = Stack<Int>()
    val mapOfValueAndIndex = hashMapOf<Int, Int>()

    nums1.forEachIndexed { index, value ->
        mapOfValueAndIndex[value] = index
    }

    for (num in nums2) {
        while (stack.isNotEmpty() && mapOfValueAndIndex.containsKey(stack.peek()) && stack.peek() < num) {
            val nums1Value = stack.pop()
            nums1[mapOfValueAndIndex[nums1Value]!!] = num
        }

        if (mapOfValueAndIndex.containsKey(num)) stack.push(num)
    }

    while (stack.isNotEmpty()) {
        val nums1Value = stack.pop()
        nums1[mapOfValueAndIndex[nums1Value]!!] = -1
    }

    return nums1
}
