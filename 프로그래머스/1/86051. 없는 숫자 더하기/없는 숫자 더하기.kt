class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
        for (item in numbers)
        answer += item
        return 45 - answer
    }
}