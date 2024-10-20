package org.fakhry.leetcode.arrays_hashing

/**
 * Intuition :
 * To check anagram, count each character inside the 2 string. If the counter is same, then it is anagram.
 * We use hashmap to put the char as a key, and the counter as the map value.
 *
 *
 * Approach :
 * - Create 2 hashmap for 2 strings
 * - Iterate each strings and put the char and its counter to the hashmap
 * - Compare both hashmap
 *
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