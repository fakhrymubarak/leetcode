package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveStarsTest {

    @Test
    fun `test with stars removing characters`() {
        val s = "leet**cod*e"
        val result = removeStars(s)
        assertEquals("lecoe", result) // Removes 't', 'e', and 'd' due to stars
    }

    @Test
    fun `test with no stars`() {
        val s = "leetcode"
        val result = removeStars(s)
        assertEquals("leetcode", result) // No stars, string remains unchanged
    }

    @Test
    fun `test with alternating characters and stars`() {
        val s = "a*b*c*d*"
        val result = removeStars(s)
        assertEquals("", result) // Every character is removed by its star
    }

    @Test
    fun `test with empty string`() {
        val s = ""
        val result = removeStars(s)
        assertEquals("", result) // Empty string remains unchanged
    }

    @Test
    fun `test with large input`() {
        val s = "a".repeat(1000) + "*".repeat(1000)
        val result = removeStars(s)
        assertEquals("", result) // All characters are removed by stars
    }
}
