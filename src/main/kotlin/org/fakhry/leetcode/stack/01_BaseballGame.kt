package org.fakhry.leetcode.stack

import java.util.*

/**
 * Calculates the sum of points based on a sequence of operations in a baseball game.
 *
 * Operations include:
 * - An integer (e.g., "5"): Adds that number to the score.
 * - "C": Invalidates the previous score (removes the last score).
 * - "D": Doubles the previous score and adds it to the total.
 * - "+": Adds the sum of the previous two scores to the total.
 *
 * Time Complexity:
 * O(n) - Iterates through the operations once, where `n` is the number of operations.
 *
 * Space Complexity:
 * O(n) - Uses a stack to store the scores.
 *
 * @see <a href="https://leetcode.com/problems/baseball-game/">Baseball Game</a>
 */
fun calPoints(operations: Array<String>): Int {
    val stack = Stack<Int>()

    for (op in operations) {
        when (op) {
            "C" -> stack.pop()
            "D" -> stack.push(stack.peek() * 2)
            "+" -> {
                val top = stack.pop()
                val top2 = stack.peek()
                stack.add(top)
                stack.add(top + top2)
            }

            else -> stack.add(op.toInt())
        }
    }

    var sum = 0
    while (stack.isNotEmpty()) {
        sum += stack.pop()
    }

    return sum
}
