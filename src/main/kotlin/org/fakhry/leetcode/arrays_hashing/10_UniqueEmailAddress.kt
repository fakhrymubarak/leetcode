package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n * m) - where `n` is the number of emails and `m` is the length of each email.
 * Each email is processed character by character to build the unique email string.
 *
 * Space Complexity :
 * O(n * m) - uses a `Set` to store each unique processed email, with each email potentially having length `m`.
 *
 * @see <a href="https://leetcode.com/problems/unique-email-addresses/">Unique Email Addresses</a>
 */
fun numUniqueEmails(emails: Array<String>): Int {
    val counterMap = mutableSetOf<String>()
    emails.forEach loop@{ email ->
        var isLocalName = true
        var containsPlus = false
        val chars = StringBuilder().apply {
            email.forEach { char ->
                if (isLocalName) {
                    when (char) {
                        '@' -> {
                            isLocalName = false
                            append(char)
                        }

                        '.' -> {}
                        '+' -> containsPlus = true
                        else -> if (!containsPlus) append(char)
                    }
                } else append(char)
            }
        }
        counterMap.add(chars.toString())
    }
    return counterMap.size
}
