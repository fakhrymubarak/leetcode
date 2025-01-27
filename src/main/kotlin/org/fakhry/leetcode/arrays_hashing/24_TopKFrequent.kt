package org.fakhry.leetcode.arrays_hashing

/**
 * Finds the top `k` most frequent elements in an array.
 *
 * The function uses a frequency map to count the occurrences of each element in the array
 * and a bucket sort-like approach to group elements by their frequency.
 *
 * Time Complexity:
 * O(n) - Building the frequency map takes O(n), and grouping elements into buckets is also O(n).
 *
 * Space Complexity:
 * O(n) - Space is used for the frequency map and the bucket array.
 *
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/">Top K Frequent Elements</a>
 */
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val mapInt = hashMapOf<Int, Int>()
    for (num in nums) {
        if (mapInt.containsKey(num)) {
            mapInt[num] = mapInt[num]!! + 1
        } else {
            mapInt[num] = 1
        }
    }

    var maxFreq = Int.MIN_VALUE
    mapInt.values.forEach {
        if (it > maxFreq) maxFreq = it
    }

    val sortedArr = Array<MutableList<Int>>(maxFreq + 1) { mutableListOf() }
    mapInt.keys.forEach { key ->
        sortedArr[mapInt[key]!!].add(key)
    }

    val res = IntArray(k)
    var r = 0
    for (i in sortedArr.size - 1 downTo 0) {
        if (sortedArr[i].isNotEmpty()) {
            sortedArr[i].forEach {
                res[r++] = it
            }
        }
        if (r == k) return res
    }

    return res
}


