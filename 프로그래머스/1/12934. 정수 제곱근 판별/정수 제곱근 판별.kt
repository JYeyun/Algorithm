import kotlin.math.pow
import kotlin.math.sqrt
    
class Solution {
    fun solution(n: Long): Long {
        var answer = sqrt(n.toDouble())
        
        return if (answer % 1.0 == 0.0){
            (answer + 1).pow(2.0).toLong()
        }
        else -1L
        
    }
}