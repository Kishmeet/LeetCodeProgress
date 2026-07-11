class Solution {
    public int[] productExceptSelf(int[] nums) {
      int cr= 1 ; int n=nums.length;
      int ans[] =new int[n];
      Arrays.fill(ans,1);;
      for(int i=1;i<n;i++)
      {
        cr*=nums[i-1];
        ans[i]*=cr;

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