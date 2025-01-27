package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IsValidTest {

    @Test
    fun `test with valid parentheses`() {
        val s = "()"
        val result = isValid(s)
        assertEquals(true, result) // Single valid pair
    }

    @Test
    fun `test with valid nested parentheses`() {
        val s = "({[]})"
        val result = isValid(s)
        assertEquals(true, result) // Properly nested and matched brackets
    }

    @Test
    fun `test with valid repeated parentheses`() {
        val s = "[]{}()"
        val result = isValid(s)
        assertEquals(true, result) // Multiple valid pairs in sequence
    }

    @Test
    fun `test with invalid order`() {
        val s = "(]"
        val result = isValid(s)
        assertEquals(false, result) // Mismatched closing bracket
    }

    @Test
    fun `test with missing closing bracket`() {
        val s = "(["
        val result = isValid(s)
        assertEquals(false, result) // Missing closing bracket
    }

    @Test
    fun `test with extra closing bracket`() {
        val s = "())"
        val result = isValid(s)
        assertEquals(false, result) // Extra closing bracket
    }

    @Test
    fun `test with empty string`() {
        val s = ""
        val result = isValid(s)
        assertEquals(true, result) // Empty string is valid
    }

    @Test
    fun `test with long invalid string`() {
        val s = "({[({[})]})"
        val result = isValid(s)
        assertEquals(false, result) // Incorrectly nested brackets
    }

    @Test
    fun `test with long valid string`() {
        val s = "(((({{{{[[[[]]]]}}}}))))"
        val result = isValid(s)
        assertEquals(true, result) // Deeply nested brackets are valid
    }
}
