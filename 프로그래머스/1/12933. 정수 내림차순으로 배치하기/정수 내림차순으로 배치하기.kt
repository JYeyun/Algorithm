class Solution {
    fun solution(n: Long): Long {
        var answer = n.toString().toMutableList().sortedDescending().joinToString("").toLong()
        return answer
    }
}