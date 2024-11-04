package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    @Test
    fun `test with normal sentence`() {
        val input = "Hello World"
        val expected = 5
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with single word`() {
        val input = "OpenAI"
        val expected = 6
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with trailing spaces`() {
        val input = "Hello World   "
        val expected = 5
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with multiple spaces between words`() {
        val input = "This    is   a   test"
        val expected = 4
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with empty string`() {
        val input = ""
        val expected = 0
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with spaces only`() {
        val input = "     "
        val expected = 0
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with one character word`() {
        val input = "a"
        val expected = 1
        assertEquals(expected, lengthOfLastWord(input))
    }

    @Test
    fun `test with sentence with punctuation`() {
        val input = "Hello, world!"
        val expected = 6
        assertEquals(expected, lengthOfLastWord(input))
    }
}
