package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n + m) - iterate twice for both strings
 *
 * Space Complexity :
 * O(n + m) - need 2 hashmap for save the char and its counter value
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram</a>
 * */
fun isAnagram(s: String, t: String): Boolean {
    val hashMapS = mutableMapOf<Char, Int>()
    val hashMapT = mutableMapOf<Char, Int>()
    s.forEach {
        val counterChar = hashMapS.getOrDefault(it, 0)
        hashMapS[it] = counterChar + 1
    }

    t.forEach {
        val counterChar = hashMapT.getOrDefault(it, 0)
        hashMapT[it] = counterChar + 1
    }

    return hashMapS == hashMapT
}

/**
 * Time Complexity:
 * O(n) - Iterates through the strings `s` and `t` twice: once to populate the frequency arrays and once to compare them.
 *
 * Space Complexity:
 * O(1) - Uses constant space for the two frequency arrays of size 26.
 */
fun isAnagramOptimized(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val arrayS = IntArray(26)
    val arrayT = IntArray(26)


    for (i in s.indices) {
        val indexS = s[i] - 'a'
        val indexT = t[i] - 'a'

        arrayS[indexS] += 1
        arrayT[indexT] += 1
    }

    for (i in 0..25) {
        if (arrayS[i] != arrayT[i]) return false
    }

    return true
}
