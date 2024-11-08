package org.fakhry.leetcode.arrays_hashing


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueEmailsTest {
    @Test
    fun `test with emails that have different 3 addresses after processing`() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        )
        val expected = 2
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with emails that have different 2 addresses after processing`() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.email.leet+alex@code.com"
        )
        val expected = 2
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with emails that are unique without modification`() {
        val emails = arrayOf(
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        )
        val expected = 3
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with emails that are the same after processing`() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.email@leetcode.com",
            "test.e.mail+alex@leetcode.com",
            "testemail@leetcode.com"
        )
        val expected = 1
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with single email`() {
        val emails = arrayOf("unique@domain.com")
        val expected = 1
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with multiple domains`() {
        val emails = arrayOf(
            "user+mail@leetcode.com",
            "user@lee.tcode.com",
            "user@leetcode.com"
        )
        val expected = 2
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with emails having no dot or plus modifications`() {
        val emails = arrayOf(
            "simpleemail@domain.com",
            "anotheremail@domain.com",
            "unique@anotherdomain.com"
        )
        val expected = 3
        assertEquals(expected, numUniqueEmails(emails))
    }

    @Test
    fun `test with edge case - email with only one character local name`() {
        val emails = arrayOf(
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        )
        val expected = 3
        assertEquals(expected, numUniqueEmails(emails))
    }
}
