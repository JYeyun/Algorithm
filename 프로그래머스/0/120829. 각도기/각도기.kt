class Solution {
    fun solution(angle: Int): Int {
        var answer : Int = if(angle <90){ 
            1
        } else if(angle == 90) {
            2
        } else if(angle < 180) {
            3
        }else{
            4
        }
        return answer
    }
}