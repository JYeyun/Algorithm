class Solution {
    fun solution(numbers: IntArray): List<Int> {
        var answer: List<Int> = mutableListOf()
        
        for(i in 0 until numbers.size - 1){
            for(j in i + 1 until numbers.size){
                answer += numbers[i] + numbers[j]
            }
        }
        answer = answer.sorted().distinct()
        return answer
    }
}