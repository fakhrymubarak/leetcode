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
