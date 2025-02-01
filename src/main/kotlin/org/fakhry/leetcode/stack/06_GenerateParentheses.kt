package org.fakhry.leetcode.stack

/**
 * Generates all valid combinations of n pairs of parentheses.
 *
 * This function uses backtracking to generate well-formed parentheses by ensuring:
 * - An opening parenthesis is added if it does not exceed `n`.
 * - A closing parenthesis is added if it does not exceed the number of opening parentheses.
 *
 * Time Complexity:
 * O(2^n) - The number of valid combinations grows exponentially.
 *
 * Space Complexity:
 * O(n) - Recursion depth is at most `2n`, and the result list stores all valid combinations.
 *
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">Generate Parentheses</a>
 */
fun generateParenthesis(n: Int): List<String> {
    val res = mutableListOf<String>()
    val stack = CharArray(n * 2)
    backtrack(res, stack, 0, 0, n)
    return res
}

private fun backtrack(res: MutableList<String>, stack: CharArray, open: Int, close: Int, limit: Int) {
    if (open == close && close == limit) {
        res.add(String(stack))
        return
    }

    val index = open + close

    if (open < limit) {
        stack[index] = '('
        backtrack(res, stack, open + 1, close, limit)
    }

    if (close < open) {
        stack[index] = ')'
        backtrack(res, stack, open, close + 1, limit)
    }
}
