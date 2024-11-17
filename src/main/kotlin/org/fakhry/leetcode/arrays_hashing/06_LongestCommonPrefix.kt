package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n * m) - where `n` is the number of strings and `m` is the length of the shortest string.
 * The function iterates over each character position up to the common prefix length across all strings.
 *
 * Space Complexity :
 * O(1) - no additional data structures are used aside from a counter variable.
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var prefixCounter = 0
    while (true) {
        if (!allStringsHaveSameCharAt(strs, prefixCounter)) break
        prefixCounter++
    }

    return strs[0].substring(0, prefixCounter)
}

private fun allStringsHaveSameCharAt(strs: Array<String>, prefixCounter: Int): Boolean {
    if (strs.any { it.length <= prefixCounter }) return false
    val firstChar = strs[0][prefixCounter]
    return strs.all { it[prefixCounter] == firstChar }
}


/**
 * Time Complexity:
 * O(n * m) - where `n` is the number of strings in the array and `m` is the length of the shortest string.
 * Each character in each string is compared at most once.
 *
 * Space Complexity:
 * O(1) - No additional space is used apart from variables for indexing and comparisons.
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 */
fun longestCommonPrefixOptimized(strs: Array<String>): String {
    val firstStr = strs[0]
    if (strs.size == 1) return firstStr

    for (i in firstStr.indices) {
        val char = firstStr[i]
        for (str in strs) {
            if (str.isEmpty()) return ""
            else if (i == str.length || str[i] != char) return str.substring(0, i)
        }
    }

    return strs[0]
}