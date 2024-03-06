class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var a = num.toLong()
        
        while(a != 1L){
            if(a % 2 == 0L) a /= 2
            else a = (a * 3) + 1
            answer++
            
            if(answer == 500){
                answer = -1
                break
            }
        }
        
        return answer
    }
}