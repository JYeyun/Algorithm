class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum: Long = 0
        var x = 0
        var y = 0
        
        if(a > b) {
            y = a
            x = b
        }
        else{
            x = a
            y = b
        }
        for(i in x .. y) sum += i
        return sum
    }
}