package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n) - iterates over the string `t` up to half its length, performing constant-time operations.
 *
 * Space Complexity :
 * O(m) - uses additional space to store the mutable version of string `s`, where `m` is the length of `s`.
 *
 * @see <a href="https://leetcode.com/problems/is-subsequence/">Is Subsequence</a>
 */
fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    if (s.isNotEmpty() && t.isEmpty()) return false

    val mutableS = s.toMutableList()
    var startIndex = 0
    var lastIndex = t.length - 1

    while (startIndex < t.length / 2 + 1) {
        if (t[startIndex] == mutableS.firstOrNull()) {
            mutableS.removeFirst()
        }

        if (startIndex < lastIndex && t[lastIndex] == mutableS.lastOrNull()) {
            mutableS.removeLast()
        }

        startIndex++
        lastIndex--
    }

    return mutableS.isEmpty()
}

/**
 * Time Complexity :
 * O(n) - iterates over string `t` up to its full length, while only moving the pointer of `s` when there is a match.
 *
 * Space Complexity :
 * O(1) - uses a constant amount of additional space.
 *
 * @see <a href="https://leetcode.com/problems/is-subsequence/">Is Subsequence</a>
 */
fun isSubsequenceOptimized(s: String, t: String): Boolean {
    var sPointer = 0
    var tPointer = 0

    while (sPointer < s.length && tPointer < t.length) {
        if (s[sPointer] == t[tPointer]) {
            sPointer++
        }
        tPointer++
    }

    return sPointer == s.length
}