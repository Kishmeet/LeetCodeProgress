class Solution {
    public int[] productExceptSelf(int[] nums) {
      int cr= 1 ; int n=nums.length;
      int ans[] =new int[n];
      for(int i=0;i<n;i++)
      {
        ans[i]=cr;
        cr*=nums[i];

      }
      cr=1;
       for(int i=n-1;i>=0;i--)
      {
        ans[i]*=cr;
        cr*=nums[i];
        
      }
     return ans;
    }
}