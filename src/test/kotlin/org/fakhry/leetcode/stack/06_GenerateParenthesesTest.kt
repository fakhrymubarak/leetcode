package org.fakhry.leetcode.stack

import kotlin.test.Test
import kotlin.test.assertEquals

class GenerateParenthesisTest {

    @Test
    fun testGenerateParenthesis() {
        assertEquals(listOf("()"), generateParenthesis(1))
        assertEquals(
            listOf("()()", "(())").sorted(),
            generateParenthesis(2).sorted()
        )
        assertEquals(
            listOf("((()))", "(()())", "(())()", "()(())", "()()()").sorted(),
            generateParenthesis(3).sorted()
        )
    }
}
