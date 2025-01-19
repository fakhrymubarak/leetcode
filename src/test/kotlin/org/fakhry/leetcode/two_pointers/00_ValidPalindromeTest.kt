package org.fakhry.leetcode.two_pointers


import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `test with a simple palindrome`() {
        val s = "racecar"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with a mixed-case palindrome`() {
        val s = "RaceCar"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with non-palindrome string`() {
        val s = "hello"
        assertFalse(isPalindrome(s))
    }

    @Test
    fun `test with alphanumeric palindrome`() {
        val s = "A man, a plan, a canal: Panama"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with string containing special characters`() {
        val s = "No lemon, no melon!"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with string containing only spaces`() {
        val s = "     "
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with an empty string`() {
        val s = ""
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with single character string`() {
        val s = "a"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with numeric palindrome`() {
        val s = "12321"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `test with numeric non-palindrome`() {
        val s = "12345"
        assertFalse(isPalindrome(s))
    }
}
