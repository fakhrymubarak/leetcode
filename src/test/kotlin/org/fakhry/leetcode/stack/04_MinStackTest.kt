package org.fakhry.leetcode.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class MinStackTest {

    @Test
    fun `test push and getMin`() {
        val minStack = MinStack()
        minStack.push(3)
        minStack.push(1)
        minStack.push(2)

        assertEquals(1, minStack.getMin()) // 1 is the minimum
    }

    @Test
    fun `test pop and getMin`() {
        val minStack = MinStack()
        minStack.push(5)
        minStack.push(2)
        minStack.push(4)
        minStack.push(1)

        assertEquals(1, minStack.getMin()) // Minimum before pop
        minStack.pop()
        assertEquals(2, minStack.getMin()) // Minimum should be updated to 2
    }

    @Test
    fun `test top element`() {
        val minStack = MinStack()
        minStack.push(8)
        minStack.push(6)
        assertEquals(6, minStack.top()) // Top should be 6
    }

    @Test
    fun `test single element stack`() {
        val minStack = MinStack()
        minStack.push(10)
        assertEquals(10, minStack.top()) // Only element should be the top
        assertEquals(10, minStack.getMin()) // Only element should be the minimum
    }

    @Test
    fun `test multiple pushes of same minimum`() {
        val minStack = MinStack()
        minStack.push(3)
        minStack.push(1)
        minStack.push(1) // Another minimum element
        minStack.pop() // Remove one occurrence of 1

        assertEquals(1, minStack.getMin()) // Minimum should still be 1
        minStack.pop() // Remove last occurrence of 1
        assertEquals(3, minStack.getMin()) // Minimum should now be 3
    }

    @Test
    fun `test empty stack throws exception`() {
        val minStack = MinStack()
        assertThrows(NoSuchElementException::class.java) { minStack.top() }
        assertThrows(NoSuchElementException::class.java) { minStack.getMin() }
    }
}
