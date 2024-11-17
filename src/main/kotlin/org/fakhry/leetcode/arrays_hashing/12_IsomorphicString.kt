package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n) - where `n` is the length of the strings `s` and `t`. The function iterates through the strings once.
 *
 * Space Complexity :
 * O(n) - Two hash maps are used to store character mappings from `s` to `t` and from `t` to `s`.
 *
 * @see <a href="https://leetcode.com/problems/isomorphic-strings/">Isomorphic Strings</a>
 */
fun isIsomorphic(s: String, t: String): Boolean {
    val pairOfCharS = hashMapOf<Char, Char>()
    val pairOfCharT = hashMapOf<Char, Char>()
    for (i in s.indices) {
        if (pairOfCharS.containsKey(s[i]).not()) {
            pairOfCharS[s[i]] = t[i]
        } else {
            if (pairOfCharS[s[i]] != t[i]) return false
        }
        if (pairOfCharT.containsKey(t[i]).not()) {
            pairOfCharT[t[i]] = s[i]
        } else {
            if (pairOfCharT[t[i]] != s[i]) return false
        }
    }
    return true
}


/**
 * Time Complexity:
 * O(n) - Iterates through the strings `s` and `t` once using a two-pointer approach.
 *
 * Space Complexity:
 * O(1) - Uses two fixed-size integer arrays of size 128 to store character mappings.
 */
fun isIsomorphicOptimized(s: String, t: String): Boolean {
    val arrS = IntArray(128)
    val arrT = IntArray(128)

    var lPointer = 0
    var rPointer = s.length - 1
    while (lPointer <= rPointer) {
        val sChar = s[lPointer]
        val tChar = t[lPointer]
        if (arrS[sChar.code] != arrT[tChar.code]) return false

        arrS[sChar.code]++
        arrT[tChar.code]++

        val sCharR = s[rPointer]
        val tCharR = t[rPointer]
        if (arrS[sCharR.code] != arrT[tCharR.code]) return false
        arrS[sCharR.code]++
        arrT[tCharR.code]++

        lPointer++
        rPointer--
    }

    return true
}
