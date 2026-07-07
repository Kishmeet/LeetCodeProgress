class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long sum=0;
        long exp=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        return (int) (exp-sum);
    }
}