class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var x = gcd(n, m)
        var y = (n * m) / x
        var answer = intArrayOf(x, y)
        return answer
    }
    fun gcd(n1: Int, n2: Int): Int {
        return if (n2 == 0) n1
        else gcd(n2, n1 % n2)
    }
}