package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordPatternTest {

    @Test
    fun `test matching pattern`() {
        val pattern = "abba"
        val str = "dog cat cat dog"
        assertEquals(true, wordPattern(pattern, str))
    }

    @Test
    fun `test non-matching pattern`() {
        val pattern = "abba"
        val str = "dog cat cat fish"
        assertEquals(false, wordPattern(pattern, str))
    }

    @Test
    fun `test pattern with extra words`() {
        val pattern = "aaaa"
        val str = "dog dog dog dog cat"
        assertEquals(false, wordPattern(pattern, str))
    }

    @Test
    fun `test pattern with fewer words`() {
        val pattern = "abab"
        val str = "dog cat"
        assertEquals(false, wordPattern(pattern, str))
    }

    @Test
    fun `test matching single character pattern`() {
        val pattern = "a"
        val str = "dog"
        assertEquals(true, wordPattern(pattern, str))
    }

    @Test
    fun `test non-matching single character pattern`() {
        val pattern = "a"
        val str = "dog dog"
        assertEquals(false, wordPattern(pattern, str))
    }

    @Test
    fun `test matching pattern with spaces`() {
        val pattern = "abc"
        val str = "one two three"
        assertEquals(true, wordPattern(pattern, str))
    }

    @Test
    fun `test non-matching pattern with word mismatch`() {
        val pattern = "abc"
        val str = "one two two"
        assertEquals(false, wordPattern(pattern, str))
    }

    @Test
    fun `test non-matching pattern due to different lengths`() {
        val pattern = "abc"
        val str = "one two three four"
        assertEquals(false, wordPattern(pattern, str))
    }
}

