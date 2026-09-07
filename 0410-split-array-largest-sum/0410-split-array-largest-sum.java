class Solution {
    public int splitArray(int[] nums, int k) {
        int high=0,low=nums[0];
        for(int i=0;i<nums.length;i++)
        {
         high+=nums[i];
         if(nums[i]>low) 
         low=nums[i];
        }
        while(low<=high)
        {
           int  mid=(low+high)/2;
           int c=countPartitions(nums,mid);
           if(c>k)
           low=mid+1;
           else
            high =mid-1;

        }
        return low;

    }
int countPartitions(int[] nums, int maxSum)
    {
        int count=1,currentSum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(currentSum+nums[i]<=maxSum)
            {
                currentSum+=nums[i];
            }
            else{
             count++;
             currentSum=nums[i];
            }
        }
      return count;
    }
}