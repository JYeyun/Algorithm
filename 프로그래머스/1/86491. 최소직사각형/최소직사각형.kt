class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var bigArray = ArrayList<Int>()
        var smallArray = ArrayList<Int>()
        
        for (i in sizes){
            if(i[0] > i[1]){
                bigArray.add(i[0])
                smallArray.add(i[1])
            }
            else
            {
                smallArray.add(i[0])
                bigArray.add(i[1])
            }
        }
        
        return bigArray.maxOf{it} * smallArray.maxOf{it}
    }
}