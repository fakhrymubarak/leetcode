package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - where `n` is the length of the string `s`.
 * - Traversing `s` takes O(n).
 * - Lookup and insert operations in the hash maps are O(1) on average.
 *
 * Space Complexity:
 * O(k) - where `k` is the number of unique characters in the pattern and unique words in the string `s`.
 * - Two hash maps are used to store mappings between pattern characters and words.
 *
 * @see <a href="https://leetcode.com/problems/word-pattern/">Word Pattern</a>
 */
fun wordPattern(pattern: String, s: String): Boolean {
    val hashMapChar = hashMapOf<Char, String>()
    val hashMapString = hashMapOf<String, Char>()
    var patternPointer = 0

    val valueBuilder = StringBuilder()
    for (i in 0..s.length) {
        if (i == s.length || s[i] == ' ') {
            if (patternPointer >= pattern.length) return false

            val value = valueBuilder.toString()
            val charOnPattern = pattern[patternPointer]
            val resultChar = hashMapChar.getOrPut(charOnPattern) { value }
            val resultString = hashMapString.getOrPut(value) { charOnPattern }

            if (resultChar != value || resultString != charOnPattern) return false
            valueBuilder.clear()
            patternPointer++
        } else {
            valueBuilder.append(s[i])
        }
    }
    return patternPointer >= pattern.length
}