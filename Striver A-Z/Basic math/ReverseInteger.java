class Solution {
    public int reverse(int n) {
        long rev = 0;
        while(n != 0)
        {
            rev = rev*10+n%10;
            n /= 10;
        }
        return rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE?0:(int)rev;
    }
}