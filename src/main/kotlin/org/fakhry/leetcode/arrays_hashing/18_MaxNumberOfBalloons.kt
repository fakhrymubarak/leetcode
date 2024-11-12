package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity:
 * O(n) - Iterates through the string once to count the occurrences of the relevant characters.
 *
 * Space Complexity:
 * O(1) - Uses constant space for the character counters (`bCounter`, `aCounter`, etc.).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-balloons/">Maximum Number of Balloons</a>
 */
fun maxNumberOfBalloons(text: String): Int {
    var bCounter = 0
    var aCounter = 0
    var lCounter = 0
    var oCounter = 0
    var nCounter = 0

    text.forEach {
        when (it) {
            'b' -> bCounter += 1
            'a' -> aCounter += 1
            'l' -> lCounter += 1
            'o' -> oCounter += 1
            'n' -> nCounter += 1
        }
    }

    lCounter /= 2
    oCounter /= 2

    return minOf(bCounter, aCounter, lCounter, oCounter, nCounter)
}