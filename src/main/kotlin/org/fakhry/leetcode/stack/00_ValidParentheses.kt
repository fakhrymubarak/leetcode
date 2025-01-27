package org.fakhry.leetcode.stack

import java.util.*

/**
 * Determines if a string containing only parentheses, curly braces, and square brackets is valid.
 *
 * A string is considered valid if:
 * - Every opening bracket has a corresponding closing bracket of the same type.
 * - Brackets are closed in the correct order.
 *
 * The function uses a stack to keep track of opening brackets and checks if they are closed correctly.
 *
 * Time Complexity:
 * O(n) - Iterates through the string once, where `n` is the length of the string.
 *
 * Space Complexity:
 * O(n) - In the worst case, the stack can contain all the opening brackets.
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (char in s) {
        when (char) {
            '(', '{', '[' -> stack.push(char)
            ')' -> {
                if (stack.isEmpty() || stack.peek() != '(') return false
                stack.pop()
            }

            '}' -> {
                if (stack.isEmpty() || stack.peek() != '{') return false
                stack.pop()
            }

            ']' -> {
                if (stack.isEmpty() || stack.peek() != '[') return false
                stack.pop()
            }
        }
    }
    return stack.isEmpty()
}
