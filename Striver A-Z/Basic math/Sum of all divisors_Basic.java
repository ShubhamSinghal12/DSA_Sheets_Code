public class Solution {
    public static int sumOfAllDivisors(int N){
        // Write your code here.
        int sum = 0;
        for(int i = 1; i <= N; i++)
            sum += (N/i)*i;
        
        return sum;
    }
}