class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        if (x < 0) {
           return false;
        }
        int d = 0, num = 0;
        while (n > 0) {
            d = n % 10;
            num = num * 10 + d;
            n = n / 10;
        }
        return x == num;
    }
}