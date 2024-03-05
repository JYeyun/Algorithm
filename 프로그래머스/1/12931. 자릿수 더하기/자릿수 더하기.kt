class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        var a = n
        while(a != 0){
            sum += a % 10
            a /= 10
        }
        return sum
    }
}