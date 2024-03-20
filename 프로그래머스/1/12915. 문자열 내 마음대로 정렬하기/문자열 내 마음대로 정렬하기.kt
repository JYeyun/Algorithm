class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = strings.sortedWith(compareBy({it[n]}, {it})).toTypedArray()
        return answer
    }
}