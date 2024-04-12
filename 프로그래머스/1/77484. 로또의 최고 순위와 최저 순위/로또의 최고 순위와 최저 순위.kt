class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var num = 0
        var zero = lottos.count{it == 0}
        for(i in lottos.indices){
            for(j in lottos.indices){
                if(lottos[i] == win_nums[j]) num++
            }
        }
    
        answer += result(num + zero)
        answer += result(num)
        return answer
    }
    fun result(number:Int) : Int {
        when(number)
        {
            6 -> return 1
            5 -> return 2
            4 -> return 3
            3 -> return 4
            2 -> return 5
            else -> return 6
        }
    }
}