package org.fakhry.leetcode.two_pointers


import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPalindrome2Test {
    @Test
    fun `test with valid palindrome without removal`() {
        val s = "racecar"
        assertTrue(validPalindrome(s)) // A valid palindrome
    }

    @Test
    fun `test with valid palindrome after one removal`() {
        val s = "abca"
        assertTrue(validPalindrome(s)) // Remove 'b' or 'c'
    }

    @Test
    fun `test with valid palindrome after removal at start`() {
        val s = "aacbbaa"
        assertTrue(validPalindrome(s)) // Remove 'c'
    }

    @Test
    fun `test with invalid palindrome`() {
        val s = "abcdef"
        assertFalse(validPalindrome(s)) // No single removal can make it a palindrome
    }

    @Test
    fun `test with an empty string`() {
        val s = ""
        assertTrue(validPalindrome(s)) // An empty string is a valid palindrome
    }

    @Test
    fun `test with a single character`() {
        val s = "a"
        assertTrue(validPalindrome(s)) // A single character is a palindrome
    }

    @Test
    fun `test with two characters - valid palindrome`() {
        val s = "aa"
        assertTrue(validPalindrome(s)) // Already a palindrome
    }

    @Test
    fun `test with two characters - invalid palindrome`() {
        val s = "ab"
        assertTrue(validPalindrome(s)) // Removing either 'a' or 'b' makes it valid
    }

    @Test
    fun `test with long string that is not a palindrome`() {
        val s = "abcdefghijklmnopqrstuvwxyz"
        assertFalse(validPalindrome(s)) // No single removal can make it a palindrome
    }

    @Test
    fun `test with long palindrome with one mistake`() {
        val s = "abccbaabccba"
        assertTrue(validPalindrome(s)) // Removing one 'a' or 'b' fixes it
    }
}
