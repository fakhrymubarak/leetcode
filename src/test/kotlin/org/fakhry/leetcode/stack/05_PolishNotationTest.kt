package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvalRPNTest {

    @Test
    fun `test basic addition`() {
        val tokens = arrayOf("2", "3", "+")
        val result = Solution().evalRPN(tokens)
        assertEquals(5, result) // 2 + 3 = 5
    }

    @Test
    fun `test basic subtraction`() {
        val tokens = arrayOf("5", "3", "-")
        val result = Solution().evalRPN(tokens)
        assertEquals(2, result) // 5 - 3 = 2
    }

    @Test
    fun `test basic multiplication`() {
        val tokens = arrayOf("4", "6", "*")
        val result = Solution().evalRPN(tokens)
        assertEquals(24, result) // 4 * 6 = 24
    }

    @Test
    fun `test basic division`() {
        val tokens = arrayOf("8", "2", "/")
        val result = Solution().evalRPN(tokens)
        assertEquals(4, result) // 8 / 2 = 4
    }

    @Test
    fun `test complex expression`() {
        val tokens = arrayOf("2", "1", "+", "3", "*")
        val result = Solution().evalRPN(tokens)
        assertEquals(9, result) // (2 + 1) * 3 = 9
    }

    @Test
    fun `test complex expression with multiple operations`() {
        val tokens = arrayOf("4", "13", "5", "/", "+")
        val result = Solution().evalRPN(tokens)
        assertEquals(6, result) // 4 + (13 / 5) = 4 + 2 = 6
    }

    @Test
    fun `test negative numbers`() {
        val tokens = arrayOf("10", "6", "9", "3", "/", "-", "*", "17", "+", "5", "+")
        val result = Solution().evalRPN(tokens)
        assertEquals(52, result) // 10 * (6 - (9 / 3)) + 17 + 5 = 52
    }

    @Test
    fun `test single number`() {
        val tokens = arrayOf("42")
        val result = Solution().evalRPN(tokens)
        assertEquals(42, result) // Only one number in stack
    }
}
