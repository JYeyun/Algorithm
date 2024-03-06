class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        arr.sort()
        
        for(i in 0 until arr.size){
            if(arr[i] % divisor == 0) answer += arr[i]
        }
        if(answer.isEmpty()) answer += -1
        
        return answer
    }
}