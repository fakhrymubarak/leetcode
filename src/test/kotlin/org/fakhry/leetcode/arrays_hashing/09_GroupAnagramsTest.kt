package org.fakhry.leetcode.arrays_hashing


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    @Test
    fun `test with typical case`() {
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val expected = listOf(
            listOf("eat", "tea", "ate"),
            listOf("tan", "nat"),
            listOf("bat")
        )
        assertEquals(
            expected.map { it.sorted() }.sortedBy { it.firstOrNull() },
            groupAnagrams(strs).map { it.sorted() }.sortedBy { it.firstOrNull() })
    }

    @Test
    fun `test with single element`() {
        val strs = arrayOf("abc")
        val expected = listOf(listOf("abc"))
        assertEquals(expected, groupAnagrams(strs))
    }

    @Test
    fun `test with multiple identical strings`() {
        val strs = arrayOf("aa", "aa", "aa")
        val expected = listOf(listOf("aa", "aa", "aa"))
        assertEquals(expected, groupAnagrams(strs))
    }

    @Test
    fun `test with no anagrams`() {
        val strs = arrayOf("abc", "def", "ghi")
        val expected = listOf(
            listOf("abc"),
            listOf("def"),
            listOf("ghi")
        )
        assertEquals(
            expected.map { it.sorted() }.sortedBy { it.firstOrNull() },
            groupAnagrams(strs).map { it.sorted() }.sortedBy { it.firstOrNull() })
    }

    @Test
    fun `test with empty string`() {
        val strs = arrayOf("")
        val expected = listOf(listOf(""))
        assertEquals(expected, groupAnagrams(strs))
    }

    @Test
    fun `test with empty strings and anagrams`() {
        val strs = arrayOf("", "", "a", "a")
        val expected = listOf(
            listOf("", ""),
            listOf("a", "a")
        )
        assertEquals(
            expected.map { it.sorted() }.sortedBy { it.firstOrNull() },
            groupAnagrams(strs).map { it.sorted() }.sortedBy { it.firstOrNull() })
    }
}