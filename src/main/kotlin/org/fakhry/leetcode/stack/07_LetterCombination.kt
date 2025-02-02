package org.fakhry.leetcode.stack

/**
 * Generates all possible letter combinations from a given digit string based on a phone keypad.
 *
 * The function maps digits (2-9) to corresponding letters and uses backtracking to explore all
 * valid combinations.
 *
 * Time Complexity:
 * O(4^n) - In the worst case, each digit maps to 4 letters, leading to 4^n possible combinations.
 *
 * Space Complexity:
 * O(n) - Uses a character array of size `n` for recursive calls.
 *
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a>
 */
fun letterCombinations(digits: String): List<String> {
    val res = mutableListOf<String>()
    backtrack(digits, CharArray(digits.length), 0, res)
    return res
}

private val mapOfNum = hashMapOf(
    '2' to "abc",
    '3' to "def",
    '4' to "ghi",
    '5' to "jkl",
    '6' to "mno",
    '7' to "pqrs",
    '8' to "tuv",
    '9' to "wxyz",
)

private fun backtrack(digits: String, curr: CharArray, pos: Int, res: MutableList<String>) {
    // Valid Condition
    if (pos == curr.size) {
        if (pos == 0) return
        res.add(String(curr))
        return
    }

    // Backtracking
    for (char in mapOfNum[digits[pos]]!!) {
        curr[pos] = char
        backtrack(digits, curr, pos + 1, res)
    }
}