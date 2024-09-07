class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long min = Math.min(A,B);
        Long max = Math.max(A,B);
        while(max%min != 0)
        {
            Long rem = max%min;
            max = min;
            min = rem;
        }
        // Long gcd = min;
        return new Long[]{(A*B)/min,min};
    }
};