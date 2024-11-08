package org.fakhry.leetcode.arrays_hashing

/**
 * Time Complexity :
 * O(n) - Iterates through the flowerbed array once.
 *
 * Space Complexity :
 * O(1) - Modifies the input array in place without additional memory usage.
 *
 * @see <a href="https://leetcode.com/problems/can-place-flowers/">Can Place Flowers</a>
 */
fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    if (flowerbed.size == 1 && flowerbed[0] == 0) return true
    if (n == 0) return true

    var possiblePlacedFlowers = 0
    for (index in flowerbed.indices) {
        if (index == 0 && flowerbed[index] == 0 && flowerbed[1] == 0) {
            flowerbed[index] = 1
            possiblePlacedFlowers++
        } else if (index == flowerbed.size - 1 && flowerbed[index] == 0 && flowerbed[index - 1] == 0) {
            flowerbed[index] = 1
            possiblePlacedFlowers++
        } else if (index != 0 && index != flowerbed.size - 1 && flowerbed[index] == 0 && flowerbed[index - 1] == 0 && flowerbed[index + 1] == 0) {
            flowerbed[index] = 1
            possiblePlacedFlowers++
        }

        if (possiblePlacedFlowers == n) return true
    }
    return false
}