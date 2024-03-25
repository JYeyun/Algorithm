class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var bottle = n
        var out = 0
        var give = 0
        var count = 0
        
        while(bottle >= a){
            give = bottle / a * a
            out = bottle / a * b
            bottle =  bottle - give + out
            count += out
        }
        
        return count
    }
}