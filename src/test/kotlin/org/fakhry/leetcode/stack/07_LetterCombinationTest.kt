package org.fakhry.leetcode.stack

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LetterCombinationsTest {

    @Test
    fun testLetterCombinations_validInputs() {
        assertEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").sorted(),
            letterCombinations("23").sorted()
        )

        assertEquals(listOf("g", "h", "i"), letterCombinations("4").sorted())

        assertEquals(listOf("w", "x", "y", "z"), letterCombinations("9").sorted())
    }

    @Test
    fun testLetterCombinations_edgeCases() {
        assertEquals(emptyList(), letterCombinations(""))

        assertEquals(
            listOf("a", "b", "c"),
            letterCombinations("2")
        )

        assertEquals(
            listOf("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc"),
            letterCombinations("22")
        )
    }

    @Test
    fun testLetterCombinations_invalidInput() {
        assertFailsWith<NullPointerException> { letterCombinations("1") } // '1' is not in map
        assertFailsWith<NullPointerException> { letterCombinations("0") } // '0' is not in map
        assertFailsWith<NullPointerException> { letterCombinations("*") } // '*' is not valid
    }
}
