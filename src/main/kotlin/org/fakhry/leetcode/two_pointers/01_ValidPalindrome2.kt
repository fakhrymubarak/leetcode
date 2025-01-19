package org.fakhry.leetcode.two_pointers

/**
 * Time Complexity:
 * O(n) - The main loop iterates through the string once, and in the worst case,
 * it performs up to two additional checks on substrings, but the total traversal remains linear.
 *
 * Space Complexity:
 * O(1) - The algorithm uses constant extra space for pointers and boolean flags.
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome-ii/">Valid Palindrome II</a>
 */
fun validPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1

    var isCharRemoved = false
    while (l < r) {
        if (!s.sameChar(l, r)) {
            if (isCharRemoved) return false

            // In case both characters can be dismissed
            if (s[l + 1] == s[r] && s[l] == s[r - 1]) {
                if (s.isPalindromeSubstring(l + 2, r - 1)) {
                    return true
                } else if (s.isPalindromeSubstring(l + 1, r - 2)) {
                    return true
                }
                return false
            } else if (s.sameChar(l + 1, r)) {
                l++
                isCharRemoved = true
            } else if (s.sameChar(l, r - 1)) {
                r--
                isCharRemoved = true
            } else {
                return false
            }
        }

        l++
        r--
    }

    return true
}

/**
 * Helper function to check if a substring is a palindrome.
 *
 * Time Complexity:
 * O(n) - In the worst case, checks the substring from `startL` to `startR`.
 *
 * Space Complexity:
 * O(1) - No additional memory is used.
 */
private fun String.isPalindromeSubstring(startL: Int, startR: Int): Boolean {
    var l = startL
    var r = startR

    while (l < r) {
        if (!sameChar(l, r)) return false
        l++
        r--
    }

    return true
}

/**
 * Helper function to check if two characters in the string are the same.
 *
 * Time Complexity:
 * O(1) - Direct character comparison.
 *
 * Space Complexity:
 * O(1) - No additional memory is used.
 */
private fun String.sameChar(l: Int, r: Int) = this[l] == this[r]