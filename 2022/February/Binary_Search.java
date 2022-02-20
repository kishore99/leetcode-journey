//PS::https://leetcode.com/problems/binary-search/
//20-02-2022
//Java

class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length -1;
    while(left <= right){
        int middle = left + (right-left)/2; // optimized
        if(target < nums[middle]){
            right = middle-1;
        }else if(target > nums[middle]){
            left = middle+1;
        }
        else{
            return middle;
        }
    }
    return -1;
    }
}
