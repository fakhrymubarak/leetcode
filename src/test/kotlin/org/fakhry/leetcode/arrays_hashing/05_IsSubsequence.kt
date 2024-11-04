package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsSubsequenceTest {

    @Test
    fun `test with s as subsequence of t`() {
        val s = "abc"
        val t = "ahbgdc"
        assertTrue(isSubsequence(s, t))
    }

    @Test
    fun `test with s not a subsequence of t`() {
        val s = "axc"
        val t = "ahbgdc"
        assertFalse(isSubsequence(s, t))
    }

    @Test
    fun `test with empty s`() {
        val s = ""
        val t = "ahbgdc"
        assertTrue(isSubsequence(s, t)) // An empty string is a subsequence of any string
    }

    @Test
    fun `test with empty t`() {
        val s = "abc"
        val t = ""
        assertFalse(isSubsequence(s, t)) // A non-empty s cannot be a subsequence of an empty t
    }

    @Test
    fun `test with both s and t empty`() {
        val s = ""
        val t = ""
        assertTrue(isSubsequence(s, t)) // An empty string is a subsequence of an empty string
    }

    @Test
    fun `test with single character match`() {
        val s = "a"
        val t = "a"
        assertTrue(isSubsequence(s, t)) // Single character match
    }

    @Test
    fun `test with single character non-match`() {
        val s = "a"
        val t = "b"
        assertFalse(isSubsequence(s, t)) // Single character non-match
    }

    @Test
    fun `test with s as longer string not in t`() {
        val s = "abcdef"
        val t = "abc"
        assertFalse(isSubsequence(s, t)) // s is longer than t, cannot be a subsequence
    }

    @Test
    fun `test with repeating characters in s`() {
        val s = "aaa"
        val t = "baaac"
        assertTrue(isSubsequence(s, t)) // "aaa" is a subsequence of "baaac"
    }

    @Test
    fun `test with non-consecutive subsequence`() {
        val s = "ace"
        val t = "abcde"
        assertTrue(isSubsequence(s, t)) // "ace" is a subsequence of "abcde"
    }
}


class IsSubsequenceOptimizedTest {

    @Test
    fun `test with s as subsequence of t`() {
        val s = "abc"
        val t = "ahbgdc"
        assertTrue(isSubsequenceOptimized(s, t))
    }

    @Test
    fun `test with s not a subsequence of t`() {
        val s = "axc"
        val t = "ahbgdc"
        assertFalse(isSubsequenceOptimized(s, t))
    }

    @Test
    fun `test with empty s`() {
        val s = ""
        val t = "ahbgdc"
        assertTrue(isSubsequenceOptimized(s, t)) // An empty string is a subsequence of any string
    }

    @Test
    fun `test with empty t`() {
        val s = "abc"
        val t = ""
        assertFalse(isSubsequenceOptimized(s, t)) // A non-empty s cannot be a subsequence of an empty t
    }

    @Test
    fun `test with both s and t empty`() {
        val s = ""
        val t = ""
        assertTrue(isSubsequenceOptimized(s, t)) // An empty string is a subsequence of an empty string
    }

    @Test
    fun `test with single character match`() {
        val s = "a"
        val t = "a"
        assertTrue(isSubsequenceOptimized(s, t)) // Single character match
    }

    @Test
    fun `test with single character non-match`() {
        val s = "a"
        val t = "b"
        assertFalse(isSubsequenceOptimized(s, t)) // Single character non-match
    }

    @Test
    fun `test with s as longer string not in t`() {
        val s = "abcdef"
        val t = "abc"
        assertFalse(isSubsequenceOptimized(s, t)) // s is longer than t, cannot be a subsequence
    }

    @Test
    fun `test with repeating characters in s`() {
        val s = "aaa"
        val t = "baaac"
        assertTrue(isSubsequenceOptimized(s, t)) // "aaa" is a subsequence of "baaac"
    }

    @Test
    fun `test with non-consecutive subsequence`() {
        val s = "ace"
        val t = "abcde"
        assertTrue(isSubsequenceOptimized(s, t)) // "ace" is a subsequence of "abcde"
    }
}
