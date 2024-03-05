class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var a = x
        while(a != 0){
            sum += a % 10
            a /= 10
        }
        
        return x % sum == 0
    }
}