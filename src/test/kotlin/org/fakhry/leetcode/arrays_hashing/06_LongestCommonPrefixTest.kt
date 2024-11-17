package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    @Test
    fun `test with common prefix`() {
        val input = arrayOf("flower", "flow", "flight")
        val expected = "fl"
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with no common prefix`() {
        val input = arrayOf("dog", "racecar", "car")
        val expected = ""
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with identical strings`() {
        val input = arrayOf("test", "test", "test")
        val expected = "test"
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with empty string in array`() {
        val input = arrayOf("flower", "flow", "")
        val expected = ""
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with single string`() {
        val input = arrayOf("single")
        val expected = "single"
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with empty array`() {
        val input = arrayOf<String>()
        val expected = ""
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with one character common prefix`() {
        val input = arrayOf("apple", "ape", "april")
        val expected = "ap"
        assertEquals(expected, longestCommonPrefix(input))
    }

    @Test
    fun `test with strings having common prefix of one letter`() {
        val input = arrayOf("interview", "interval", "internet")
        val expected = "inter"
        assertEquals(expected, longestCommonPrefix(input))
    }
}

class LongestCommonPrefixOptimizedTest {

    @Test
    fun `test with common prefix`() {
        val input = arrayOf("flower", "flow", "flight")
        val expected = "fl"
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with no common prefix`() {
        val input = arrayOf("dog", "racecar", "car")
        val expected = ""
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with identical strings`() {
        val input = arrayOf("test", "test", "test")
        val expected = "test"
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with empty string in array`() {
        val input = arrayOf("flower", "flow", "")
        val expected = ""
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with single string`() {
        val input = arrayOf("single")
        val expected = "single"
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with one character common prefix`() {
        val input = arrayOf("apple", "ape", "april")
        val expected = "ap"
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }

    @Test
    fun `test with strings having common prefix of one letter`() {
        val input = arrayOf("interview", "interval", "internet")
        val expected = "inter"
        assertEquals(expected, longestCommonPrefixOptimized(input))
    }
}
