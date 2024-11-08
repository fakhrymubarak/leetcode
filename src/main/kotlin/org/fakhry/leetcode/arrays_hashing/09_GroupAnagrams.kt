package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n * m log m) - where `n` is the number of strings in `strs` and `m` is the maximum length of a string.
 * Each string is sorted (O(m log m)) and stored in a hash map, making the total complexity O(n * m log m).
 *
 * Space Complexity :
 * O(n * m) - the hash map stores each string grouped by its sorted character list, and the result list stores all strings.
 *
 * @see <a href="https://leetcode.com/problems/group-anagrams/">Group Anagrams</a>
 */
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.size == 1) return listOf(listOf(strs.first()))
    val result = hashMapOf<List<Char>, MutableList<String>>()

    strs.forEach { str ->
        val sortedChar = str.toCharArray().sorted()
        if (result.containsKey(sortedChar)) {
            result[sortedChar]?.add(str)
        } else {
            result[sortedChar] = mutableListOf(str)
        }
    }

    return result.map { it.value }
}