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