class Solution {
    fun solution(a: Int, b: Int): String {
        val date = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val day = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        var sum = b
        for(i in 0 until a - 1){
            sum += date[i]
        }
        
        return day[sum % 7]
    }
}