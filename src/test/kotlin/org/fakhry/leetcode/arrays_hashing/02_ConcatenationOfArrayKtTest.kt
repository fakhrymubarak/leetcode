package org.fakhry.leetcode.arrays_hashing

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ConcatenationOfArrayKtTest {

    @Test
    fun getConcatenation_givenArray_returnTwiceOfIt() {
        val params = intArrayOf(1, 2, 1)
        val result = getConcatenation(params)

        assertContentEquals(expected = intArrayOf(1, 2, 1, 1, 2, 1), actual = result)
    }
}