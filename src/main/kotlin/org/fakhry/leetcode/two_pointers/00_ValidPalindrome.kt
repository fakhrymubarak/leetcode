package org.fakhry.leetcode.two_pointers

/**
 * Time Complexity:
 * O(n) - where `n` is the length of the string `s`. Each character is processed at most once,
 * as the two pointers traverse the string from opposite ends.
 *
 * Space Complexity:
 * O(1) - The algorithm uses a constant amount of extra space for the two pointers and helper function calls.
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">Valid Palindrome</a>
 */
fun isPalindrome(s: String): Boolean {
    var lPointer = 0
    var rPointer = s.length - 1

    while (lPointer < rPointer) {
        while (lPointer < rPointer && !s[lPointer].isAlphanumeric()) {
            lPointer++
        }

        while (lPointer < rPointer && !s[rPointer].isAlphanumeric()) {
            rPointer--
        }

        if (s[lPointer].lowercase() != s[rPointer].lowercase()) return false

        lPointer++
        rPointer--
    }

    return true
}

fun Char.isAlphanumeric(): Boolean {
    return code in 65..90 || code in 97..122 || code in 48..57
}