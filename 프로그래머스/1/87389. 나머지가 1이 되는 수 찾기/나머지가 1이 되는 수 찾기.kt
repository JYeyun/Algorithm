class Solution {
    fun solution(n: Int): Int {
        var a = 0
        for(i in 1..n){
            if(n%i == 1){
                a = i
                break
            }
        }
        return a
    }
}