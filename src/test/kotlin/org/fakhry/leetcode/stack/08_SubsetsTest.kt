package org.fakhry.leetcode.stack

import kotlin.test.Test
import kotlin.test.assertEquals

class SubsetsTest {

    @Test
    fun testSubsets_basicCases() {
        assertEquals(
            listOf(listOf(), listOf(1)).sortedBy { it.toString() },
            subsets(intArrayOf(1)).sortedBy { it.toString() }
        )

        assertEquals(
            listOf(listOf(), listOf(1), listOf(2), listOf(1, 2)).sortedBy { it.toString() },
            subsets(intArrayOf(1, 2)).sortedBy { it.toString() }
        )

        assertEquals(
            listOf(
                listOf(), listOf(1), listOf(2), listOf(3), listOf(1, 2),
                listOf(1, 3), listOf(2, 3), listOf(1, 2, 3)
            ).sortedBy { it.toString() },
            subsets(intArrayOf(1, 2, 3)).sortedBy { it.toString() }
        )
    }

    @Test
    fun testSubsets_edgeCases() {
        assertEquals(listOf(emptyList()), subsets(intArrayOf())) // Empty array should return [[]]

        assertEquals(
            listOf(
                listOf(), listOf(0)
            ).sortedBy { it.toString() },
            subsets(intArrayOf(0)).sortedBy { it.toString() }
        )
    }

    @Test
    fun testSubsets_largeInput() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val result = subsets(nums)
        assertEquals(32, result.size) // 2^5 = 32 subsets
    }
}
