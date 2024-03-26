class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var min = intArrayOf()
        for(i in score.indices){
            if(answer.size < k) answer += score[i]
            else if(answer[0] < score[i]) answer[0] = score[i]
            answer = answer.sortedArray()
            min += answer[0]
        }
        return min
    }
}