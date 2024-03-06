class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var number = phone_number.toCharArray()
        for(i in 0 until number.size - 4){
            answer += "*"
        }
        for(i in number.size - 4 until number.size){
            answer += number[i]
        }
        return answer
    }
}