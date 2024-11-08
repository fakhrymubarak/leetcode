package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CanPlaceFlowersTest {

    @Test
    fun `test with enough spaces for flowers`() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 1
        assertTrue(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with not enough spaces for flowers`() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 2
        assertFalse(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with empty flowerbed`() {
        val flowerbed = intArrayOf()
        val n = 1
        assertFalse(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with single empty plot`() {
        val flowerbed = intArrayOf(0)
        val n = 1
        assertTrue(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with single occupied plot`() {
        val flowerbed = intArrayOf(1)
        val n = 1
        assertFalse(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with n equals zero`() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 0
        assertTrue(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with multiple spaces available`() {
        val flowerbed = intArrayOf(0, 0, 0, 0, 0)
        val n = 2
        assertTrue(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with no empty space`() {
        val flowerbed = intArrayOf(1, 1, 1, 1, 1)
        val n = 1
        assertFalse(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with edge case of adjacent flowers`() {
        val flowerbed = intArrayOf(0, 1, 0, 1, 0)
        val n = 1
        assertFalse(canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun `test with exact spaces available`() {
        val flowerbed = intArrayOf(0, 0, 1, 0, 0)
        val n = 1
        assertTrue(canPlaceFlowers(flowerbed, n))
    }
}
