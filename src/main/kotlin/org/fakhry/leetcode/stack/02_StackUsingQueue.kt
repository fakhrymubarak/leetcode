package org.fakhry.leetcode.stack

/**
 * Implements a stack using two queues.
 *
 * The stack follows Last In First Out (LIFO) order, and this implementation maintains stack behavior
 * using two queues (`queue1` and `queue2`). Elements are always pushed into the non-empty queue,
 * and when popping or retrieving the top element, all but one element are transferred to the
 * secondary queue to simulate stack behavior.
 *
 * Time Complexity:
 * - `push(x)`: **O(1)** - Always inserts into the non-empty queue.
 * - `pop()`: **O(n)** - Moves all but the last element to another queue before removing the last element.
 * - `top()`: **O(n)** - Similar to `pop()`, but reinserts the last element back into the queue.
 * - `empty()`: **O(1)** - Simply checks if both queues are empty.
 *
 * Space Complexity:
 * O(n) - Uses two queues to store the elements.
 *
 * @see <a href="https://leetcode.com/problems/implement-stack-using-queues/">Implement Stack Using Queues</a>
 */
class MyStack {
    private val queue1: ArrayDeque<Int> = ArrayDeque()
    private val queue2: ArrayDeque<Int> = ArrayDeque()

    /**
     * Pushes an element onto the stack.
     */
    fun push(x: Int) {
        if (queue1.isNotEmpty()) {
            queue1.add(x)
        } else {
            queue2.add(x)
        }
    }

    /**
     * Removes the element on top of the stack and returns it.
     */
    fun pop(): Int {
        return moveAndExtract(true)
    }

    /**
     * Returns the top element without removing it.
     */
    fun top(): Int {
        return moveAndExtract(false)
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     */
    fun empty(): Boolean {
        return queue1.isEmpty() && queue2.isEmpty()
    }

    /**
     * Moves elements between queues to extract the last added element.
     * If `isPop` is true, removes the last element; otherwise, re-adds it.
     */
    private fun moveAndExtract(isPop: Boolean): Int {
        val activeQueue = if (queue1.isEmpty()) queue2 else queue1
        val passiveQueue = if (queue1.isEmpty()) queue1 else queue2

        while (activeQueue.size > 1) {
            passiveQueue.add(activeQueue.removeFirst())
        }

        val last = activeQueue.removeFirst()
        if (!isPop) passiveQueue.add(last)

        return last
    }
}
