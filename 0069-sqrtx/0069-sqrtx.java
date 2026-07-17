class Solution {
    public int mySqrt(int x) {
        //O(log log x)  Newton-Raphson
        if (x == 0) return 0;

        long r = x;

        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}