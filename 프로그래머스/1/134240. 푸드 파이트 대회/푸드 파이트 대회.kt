class Solution {
    fun solution(food: IntArray): String {
        var answer = StringBuilder()
        
        for(i in 1 until food.size){
            for(j in 0 until (food[i]/2) * 2){
                answer.insert(answer.length/2, i)
            }
        }
        answer.insert(answer.length/2, "0")
        return answer.toString()
    }
}