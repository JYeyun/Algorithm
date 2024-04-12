import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(i in 1 .. number){
            var num = sqrt(i.toDouble())
            var numlist = listOf<Int>()
            for(j in 1 .. num.toInt()){
                if(i % j == 0) {
                    numlist += j
                    if(i/j != j) numlist += i/j
                }
                if(numlist.size > limit) {
                    answer += power
                    break
                }
            }
            if(numlist.size <= limit) answer += numlist.size
        }
        return answer
    }
}