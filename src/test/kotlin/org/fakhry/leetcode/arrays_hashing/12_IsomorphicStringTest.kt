package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsomorphicStringsTest {

    @Test
    fun `test with isomorphic strings`() {
        val s = "egg"
        val t = "add"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with isomorphic strings 2`() {
        val s = "paper"
        val t = "title"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with isomorphic strings 3`() {
        val s = "abc"
        val t = "xyz"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with non-isomorphic strings`() {
        val s = "foo"
        val t = "bar"
        assertFalse(isIsomorphic(s, t))
    }

    @Test
    fun `test with single character strings`() {
        val s = "a"
        val t = "b"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with identical strings`() {
        val s = "abc"
        val t = "abc"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with repeating characters`() {
        val s = "aab"
        val t = "xxy"
        assertTrue(isIsomorphic(s, t))
    }

    @Test
    fun `test with mismatched repeating patterns`() {
        val s = "aab"
        val t = "xyz"
        assertFalse(isIsomorphic(s, t))
    }

    @Test
    fun `test with empty strings`() {
        val s = ""
        val t = ""
        assertTrue(isIsomorphic(s, t)) // Empty strings are trivially isomorphic
    }

    @Test
    fun `test with overlapping mappings`() {
        val s = "ab"
        val t = "aa"
        assertFalse(isIsomorphic(s, t)) // Multiple characters in `s` map to the same character in `t`
    }
}
