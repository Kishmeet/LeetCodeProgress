class Solution {
    public int removeElement(int[] nums, int val) {
        int index=-1; 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            { index=i;
            break;
        }}
         if (index==-1) return nums.length;
      for(int i=index+1;i<nums.length;i++)
      {
        if(nums[i]!=val)
        {
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            index++;
        }
      }
    return index;
    }
}