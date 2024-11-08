package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(numRows^2) - iterates through each row up to `numRows`, and for each row, iterates up to the row length.
 *
 * Space Complexity :
 * O(numRows^2) - stores all elements in the resulting Pascal's Triangle.
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">Pascal's Triangle</a>
 */
fun generatePascalsTriangle(numRows: Int): List<List<Int>> {
    val pascals = mutableListOf<List<Int>>()
    repeat(numRows) { numIndex ->
        val row = mutableListOf<Int>()
        repeat(numIndex + 1) { rowIndex ->
            if (rowIndex == 0 || rowIndex == numIndex) {
                row.add(1)
            } else {
                val lastPascal = pascals.last()
                row.add(lastPascal[rowIndex - 1] + lastPascal[rowIndex])
            }
        }
        pascals.add(row)
    }
    return pascals
}