class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left .. right){
            if(factors(i) % 2 == 0) answer += i
            else answer -= i
        }
        return answer
    }
    fun factors(num: Int): Int{
        var a = 0
        for(i in 1 .. num ) if(num % i == 0) a++
        return a
    }
}