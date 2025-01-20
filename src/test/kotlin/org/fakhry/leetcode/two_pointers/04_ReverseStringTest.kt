package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ReverseStringTest {
    @Test
    fun `test with even length string`() {
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(input)
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')
        assertArrayEquals(expected, input)
    }

    @Test
    fun `test with odd length string`() {
        val input = charArrayOf('a', 'b', 'c', 'd', 'e')
        reverseString(input)
        val expected = charArrayOf('e', 'd', 'c', 'b', 'a')
        assertArrayEquals(expected, input)
    }

    @Test
    fun `test with single character string`() {
        val input = charArrayOf('z')
        reverseString(input)
        val expected = charArrayOf('z')
        assertArrayEquals(expected, input)
    }

    @Test
    fun `test with palindrome string`() {
        val input = charArrayOf('r', 'a', 'c', 'e', 'c', 'a', 'r')
        reverseString(input)
        val expected = charArrayOf('r', 'a', 'c', 'e', 'c', 'a', 'r')
        assertArrayEquals(expected, input)
    }

    @Test
    fun `test with repeated characters`() {
        val input = charArrayOf('a', 'a', 'a', 'a')
        reverseString(input)
        val expected = charArrayOf('a', 'a', 'a', 'a')
        assertArrayEquals(expected, input)
    }
}
