package org.fakhry.leetcode.stack

/**
 * Implements a stack that supports retrieving the minimum element in O(1) time.
 *
 * The stack maintains two `ArrayDeque` structures:
 * - `stack`: Stores all elements as a normal stack.
 * - `stackMin`: Stores the minimum elements to allow quick retrieval of the smallest element.
 *
 * Operations:
 * - `push(x)`: Pushes an element onto the stack and updates the min stack if necessary.
 * - `pop()`: Removes the top element and updates the min stack.
 * - `top()`: Returns the top element of the stack.
 * - `getMin()`: Returns the minimum element in O(1) time.
 *
 * Time Complexity:
 * - `push(x)`: **O(1)**
 * - `pop()`: **O(1)**
 * - `top()`: **O(1)**
 * - `getMin()`: **O(1)**
 *
 * Space Complexity:
 * O(n) - Uses an additional stack (`stackMin`) to track minimum values.
 *
 * @see <a href="https://leetcode.com/problems/min-stack/">Min Stack</a>
 */
class MinStack {
    private val stack = ArrayDeque<Int>()
    private val stackMin = ArrayDeque<Int>()

    /**
     * Pushes an element onto the stack.
     * Also updates the min stack to maintain the current minimum value.
     */
    fun push(`val`: Int) {
        stack.addLast(`val`)
        if (stackMin.isEmpty() || `val` <= stackMin.last()) stackMin.addLast(`val`)
    }

    /**
     * Removes the top element from the stack.
     * If the removed element is the current minimum, it is also removed from the min stack.
     */
    fun pop() {
        if (stack.removeLast() == stackMin.last()) {
            stackMin.removeLast()
        }
    }

    /**
     * Returns the top element of the stack.
     */
    fun top() = stack.last()

    /**
     * Returns the minimum element in the stack in O(1) time.
     */
    fun getMin() = stackMin.last()
}
