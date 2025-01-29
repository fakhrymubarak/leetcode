package org.fakhry.leetcode.stack

/**
 * Evaluates the value of an arithmetic expression in Reverse Polish Notation (RPN).
 *
 * The function processes an array of tokens representing an RPN expression.
 * It uses a stack (implemented via an `IntArray`) to store intermediate values and
 * applies arithmetic operations when encountering operators.
 *
 * Supported operations: `+`, `-`, `*`, `/`
 *
 * Time Complexity:
 * O(n) - Iterates through the input tokens once.
 *
 * Space Complexity:
 * O(n) - Uses a stack of size `n` to store intermediate results.
 *
 * @see <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">Evaluate Reverse Polish Notation</a>
 */
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = IntArray(tokens.size)
        var p = 0

        for (value in tokens) {
            when (value) {
                "+" -> {
                    val b = stack[--p]
                    val a = stack[--p]
                    stack[p++] = a + b
                }

                "*" -> {
                    val b = stack[--p]
                    val a = stack[--p]
                    stack[p++] = a * b
                }

                "-" -> {
                    val b = stack[--p]
                    val a = stack[--p]
                    stack[p++] = a - b
                }

                "/" -> {
                    val b = stack[--p]
                    val a = stack[--p]
                    stack[p++] = a / b
                }

                else -> stack[p++] = value.toInt()
            }
        }
        return stack[p - 1]
    }
}
