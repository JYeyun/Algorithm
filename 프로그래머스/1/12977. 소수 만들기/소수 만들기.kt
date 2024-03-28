class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for(i in 0 until nums.size - 2){
            for(j in i + 1 until nums.size - 1){
                for(k in j + 1 until nums.size){
                    var check = 0
                    var num = nums[i] + nums[j] + nums[k]
                    for(x in 2 until num){
                        if(num % x == 0) {
                            check = 1
                            break
                        } 
                    }
                    if(check == 0) answer++
                }
            }
        }

        return answer
    }
}