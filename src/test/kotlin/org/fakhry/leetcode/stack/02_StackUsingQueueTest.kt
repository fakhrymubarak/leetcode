package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MyStackTest {

    @Test
    fun `test push and pop`() {
        val stack = MyStack()
        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.pop()) // Last in, first out
        assertEquals(2, stack.pop()) // Next in line
    }

    @Test
    fun `test push and top`() {
        val stack = MyStack()
        stack.push(10)
        stack.push(20)

        assertEquals(20, stack.top()) // Top element without removal
        assertEquals(20, stack.pop()) // Pop should still return 20
        assertEquals(10, stack.top()) // Now top should be 10
    }

    @Test
    fun `test empty stack`() {
        val stack = MyStack()

        assertTrue(stack.empty()) // Stack should be empty initially

        stack.push(5)
        assertFalse(stack.empty()) // Stack should no longer be empty after push

        stack.pop()
        assertTrue(stack.empty()) // Stack should be empty again after popping the only element
    }

    @Test
    fun `test pop till empty`() {
        val stack = MyStack()
        stack.push(100)
        stack.push(200)
        stack.push(300)

        assertEquals(300, stack.pop())
        assertEquals(200, stack.pop())
        assertEquals(100, stack.pop())

        assertTrue(stack.empty()) // Stack should now be empty
    }

    @Test
    fun `test single element stack`() {
        val stack = MyStack()
        stack.push(42)

        assertEquals(42, stack.top()) // Top should return the same element
        assertEquals(42, stack.pop()) // Pop should return the same element

        assertTrue(stack.empty()) // Stack should be empty after popping last element
    }
}
