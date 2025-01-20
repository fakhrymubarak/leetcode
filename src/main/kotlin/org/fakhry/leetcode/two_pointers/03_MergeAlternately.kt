package org.fakhry.leetcode.two_pointers

/**
 * Time Complexity:
 * O(n + m) - where `n` is the length of `word1` and `m` is the length of `word2`.
 * The function iterates through both strings once to merge them alternately.
 *
 * Space Complexity:
 * O(n + m) - The space used by the `StringBuilder` to store the resulting merged string.
 *
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">Merge Strings Alternately</a>
 */
fun mergeAlternately(word1: String, word2: String): String {
    var pointer1 = 0
    var pointer2 = 0

    val result = StringBuilder()
    while (pointer1 <= word1.length - 1 || pointer2 <= word2.length - 1) {
        if (pointer1 <= word1.length - 1) {
            result.append(word1[pointer1])
            pointer1++
        }

        if (pointer2 <= word2.length - 1) {
            result.append(word2[pointer2])
            pointer2++
        }
    }

    return result.toString()
}
