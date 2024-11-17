package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidAnagramKtTest {

    @Test
    fun isAnagram_withFalseAnagram_returnFalse() {
        val s = "aaa"
        val t = "a"

        val result = isAnagram(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withFalseAnagram2_returnFalse() {
        val s = "rat"
        val t = "car"

        val result = isAnagram(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withRealAnagram_returnTrue() {
        val s = "anagram"
        val t = "nagaram"

        val result = isAnagram(s, t)
        assertEquals(expected = true, actual = result)
    }
}

class ValidAnagramOptimizedTest {

    @Test
    fun isAnagram_withFalseAnagram_returnFalse() {
        val s = "aaa"
        val t = "a"

        val result = isAnagramOptimized(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withFalseAnagram2_returnFalse() {
        val s = "rat"
        val t = "car"

        val result = isAnagramOptimized(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withFalseLongAnagram_returnFalse() {
        val s = "lkjasdhfsaklfhkalsdjhaslkdasdkjahsdkasmm"
        val t = "lkjasdhfsaklfhkalsdjhaslkdasdkjahsdkasmn"

        val result = isAnagramOptimized(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withFalseAnagram3_returnFalse() {
        val s = "a"
        val t = "b"

        val result = isAnagramOptimized(s, t)
        assertEquals(expected = false, actual = result)
    }

    @Test
    fun isAnagram_withRealAnagram_returnTrue() {
        val s = "anagram"
        val t = "nagaram"

        val result = isAnagramOptimized(s, t)
        assertEquals(expected = true, actual = result)
    }
}