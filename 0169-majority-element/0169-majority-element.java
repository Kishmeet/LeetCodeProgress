class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int c = 0;
        int n=nums.length;
        for (int i=0;i<n;i++) {
            if (nums[i] == el)
                c++;
            else
                c--;

            if(c==0 && (i+1)<n)
             el=nums[i+1];

        }
        // c=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]==el)
        //      c++;
        // }
        // if(c>(n/2))
        //  return el;

        // else
        //  return -1;
         return el;
    }
}