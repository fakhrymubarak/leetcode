package org.fakhry.leetcode.stack

/**
 * Removes stars ('*') from a string, where each star removes the character immediately preceding it.
 *
 * The function uses a stack-like approach to build the result string dynamically. When a star is encountered,
 * the most recently added character is removed from the stack. After processing all characters, the remaining
 * characters in the stack represent the resulting string.
 *
 * Time Complexity:
 * O(n) - Iterates through the string once and processes each character.
 *
 * Space Complexity:
 * O(n) - Uses a mutable list (stack) to store the resulting characters.
 *
 * @see <a href="https://leetcode.com/problems/removing-stars-from-a-string/">Removing Stars From a String</a>
 */
fun removeStars(s: String): String {
    val stack = mutableListOf<Char>()

    for (char in s) {
        if (char == '*') {
            stack.removeLast()
        } else {
            stack.add(char)
        }
    }

    val res = StringBuilder()
    for (char in stack) {
        res.append(char)
    }
    return res.toString()
}
