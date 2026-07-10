class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int el1 = Integer.MIN_VALUE, c1 = 0;
        int el2 = Integer.MIN_VALUE, c2 = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (c1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                c1++;
            } else if (c2 == 0 && el1 != nums[i]) {
                el2 = nums[i];
                c2++;
            } else if (nums[i] == el1)
                c1++;
            else if (nums[i] == el2)
                c2++;
            else {
                c1--;
                c2--;
            }
        }

        // if (el1 > el2) {
        //     int temp = el1;
        //     el1 = el2;
        //     el2 = temp;

        // }
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) {
                c1++;
            }
            if (nums[i] == el2) {
                c2++;
            }
        }
        int min = (n / 3) + 1;
        if (c1 >= min) {
            list.add(el1);
        }
        if (c2 >= min) {
            list.add(el2);
        }

        return list;

    }
}