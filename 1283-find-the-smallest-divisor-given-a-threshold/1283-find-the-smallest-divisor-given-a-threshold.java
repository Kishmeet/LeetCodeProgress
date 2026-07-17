class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = 0;
        for (int x : nums) {
            high = Math.max(high, x);
        }
     int low=1;
     while(low<=high)
     {
        int mid =low + (high-low)/2;
        if(sumDivisor(nums,mid,threshold))
         high=mid-1;
       else 
       low=mid+1;
     }
     return low;
    }

    boolean sumDivisor(int nums[], int x, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + x - 1) / x;
        }
          
        return sum <= threshold;
    }
}