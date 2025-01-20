package org.fakhry.leetcode.two_pointers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeAlternatelyTest {

    @Test
    fun `test with equal length strings`() {
        val word1 = "abc"
        val word2 = "123"
        val result = mergeAlternately(word1, word2)
        assertEquals("a1b2c3", result) // Alternates characters from both strings
    }

    @Test
    fun `test with word1 longer than word2`() {
        val word1 = "abcd"
        val word2 = "12"
        val result = mergeAlternately(word1, word2)
        assertEquals("a1b2cd", result) // Remaining characters from word1 are appended
    }

    @Test
    fun `test with word2 longer than word1`() {
        val word1 = "ab"
        val word2 = "1234"
        val result = mergeAlternately(word1, word2)
        assertEquals("a1b234", result) // Remaining characters from word2 are appended
    }

    @Test
    fun `test with empty word1`() {
        val word1 = ""
        val word2 = "123"
        val result = mergeAlternately(word1, word2)
        assertEquals("123", result) // Only characters from word2 are used
    }

    @Test
    fun `test with empty word2`() {
        val word1 = "abc"
        val word2 = ""
        val result = mergeAlternately(word1, word2)
        assertEquals("abc", result) // Only characters from word1 are used
    }

    @Test
    fun `test with both strings empty`() {
        val word1 = ""
        val word2 = ""
        val result = mergeAlternately(word1, word2)
        assertEquals("", result) // Result is empty as both strings are empty
    }

    @Test
    fun `test with single character strings`() {
        val word1 = "a"
        val word2 = "1"
        val result = mergeAlternately(word1, word2)
        assertEquals("a1", result) // Alternates the single characters
    }

    @Test
    fun `test with one string much longer than the other`() {
        val word1 = "a"
        val word2 = "123456789"
        val result = mergeAlternately(word1, word2)
        assertEquals("a123456789", result) // Appends all remaining characters from the longer string
    }
}
