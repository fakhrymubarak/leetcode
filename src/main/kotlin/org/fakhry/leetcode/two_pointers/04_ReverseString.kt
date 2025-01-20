package org.fakhry.leetcode.two_pointers

/**
 * Time Complexity:
 * O(n) - where `n` is the length of the input character array. The loop runs for half the size of the array.
 *
 * Space Complexity:
 * O(1) - Performs the reversal in-place without using any additional memory.
 *
 * @param s The character array to be reversed in place.
 *
 * @see <a href="https://leetcode.com/problems/reverse-string/">Reverse String</a>
 */
fun reverseString(s: CharArray) {
    var tp: Char
    val len = s.size - 1
    val halfSize = if (len % 2 == 0) len / 2 else (len / 2) + 1
    for (i in 0 until halfSize) {
        tp = s[i]
        s[i] = s[s.size - i - 1]
        s[s.size - i - 1] = tp
    }
}
