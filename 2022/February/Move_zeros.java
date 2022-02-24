//PS::https://leetcode.com/problems/move-zeroes/submissions/
//24-02-2022
//Java

class Solution {
    public void moveZeroes(int[] nums) {
        int current =  0;
       for(int i =0;i<nums.length;i++)
       {
           if(nums[i]!=0)
           {
               nums[current] = nums[i];
                current++;
           }

       }
        for(int i = current;i<nums.length;i++)
        {
            nums[i] = 0;
        }
    }

}
