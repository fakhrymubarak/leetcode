package org.fakhry.leetcode.arrays_hashing

/**
 * Intuition :
 * The most simple approach to check if the array contains duplicate
 * is to compare each element with every other element that comes after it in the array.
 * If a match is found, it means a duplicate exists, and we can return true immediately.
 * Otherwise, if no matches are found after comparing all pairs, return false.
 *
 *
 * Approach :
 * - Iterate element with the index.
 * - After get the value and the index, iterate it again from the index + 1 after end, then compare each element.
 *
 * Time Complexity :
 * O(n^2) - the solution contains nested loop
 *
 * Space Complexity :
 * O(1) - no additional data structure involves
 *
 * */
fun containsDuplicate(nums: IntArray): Boolean {
    nums.forEachIndexed { index, value ->
        for (index2 in (index + 1) until nums.size) {
            if (value == nums[index2]) return true
        }
    }
    return false
}

/**
 * Best Approach
 *
 * Intuition :
 * To determine if there are any duplicates in the input array,
 * a good approach is to track the elements we have seen so far.
 * Using a `set` allows us to quickly check if an element has already been encountered
 * since sets do not allow duplicate elements.
 *
 * Approach :
 * - Create an empty mutableSetOf to store the numbers we encounter.
 * - Iterate through each element of the input array, and add the value to the set.
 * - If the set failed to add value(due to duplicate found) directly return true
 *
 * Time Complexity :
 * O(n) - iterate once (O(n)), add and lookup on set is (O(1))
 *
 * Space Complexity :
 * O(n) - create a mutable set with the worst case no duplicates will add all the iteration to the set.
 *
 * */
fun containsDuplicate2(nums: IntArray): Boolean {
    val setOfNums = mutableSetOf<Int>()
    nums.forEach {
        if (!setOfNums.add(it)) return true
    }
    return false
}

