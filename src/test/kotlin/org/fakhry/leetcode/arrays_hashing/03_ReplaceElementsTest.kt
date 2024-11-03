package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

class ReplaceElementsTest {

    @Test
    fun `test replaceElements with multiple elements`() {
        val input = intArrayOf(17, 18, 5, 4, 6, 1)
        val expected = intArrayOf(18, 6, 6, 6, 1, -1)
        assertArrayEquals(expected, replaceElements(input))
    }

    @Test
    fun `test replaceElements with single element`() {
        val input = intArrayOf(5)
        val expected = intArrayOf(-1)
        assertArrayEquals(expected, replaceElements(input))
    }

    @Test
    fun `test replaceElements with empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()
        assertArrayEquals(expected, replaceElements(input))
    }

    @Test
    fun `test replaceElements with all same elements`() {
        val input = intArrayOf(3, 3, 3, 3)
        val expected = intArrayOf(3, 3, 3, -1)
        assertArrayEquals(expected, replaceElements(input))
    }

    @Test
    fun `test replaceElementsFinal with multiple elements`() {
        val input = intArrayOf(17, 18, 5, 4, 6, 1)
        val expected = intArrayOf(18, 6, 6, 6, 1, -1)
        assertArrayEquals(expected, replaceElementsFinal(input))
    }

    @Test
    fun `test replaceElementsFinal with single element`() {
        val input = intArrayOf(5)
        val expected = intArrayOf(-1)
        assertArrayEquals(expected, replaceElementsFinal(input))
    }

    @Test
    fun `test replaceElementsFinal with empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()
        assertArrayEquals(expected, replaceElementsFinal(input))
    }

    @Test
    fun `test replaceElementsFinal with all same elements`() {
        val input = intArrayOf(3, 3, 3, 3)
        val expected = intArrayOf(3, 3, 3, -1)
        assertArrayEquals(expected, replaceElementsFinal(input))
    }
}
