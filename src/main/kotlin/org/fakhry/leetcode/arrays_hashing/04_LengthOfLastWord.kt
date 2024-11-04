package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n) - iterates through the string once, first to skip trailing spaces and then to count the last word's length.
 *
 * Space Complexity :
 * O(1) - uses a constant amount of additional space.
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">Length of Last Word</a>
 */
fun lengthOfLastWord(s: String): Int {
    var totalLastWord = 0
    var i = s.length - 1

    // Skip trailing spaces
    while (i >= 0 && s[i] == ' ') i--

    // Count the length of the last word
    while (i >= 0 && s[i] != ' ') {
        totalLastWord++
        i--
    }

    return totalLastWord
}