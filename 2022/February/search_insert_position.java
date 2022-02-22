//PS::https://leetcode.com/problems/search-insert-position/
//22-02-2022
//Java

class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);

    }
    public int binarySearch(int[] nums, int l, int r, int target){

        int mid = l + (r-l)/2;

        if(r>=l){

            if(nums[mid]==target){
                return mid;
            }

            if(target>nums[mid]){
                return binarySearch(nums,mid+1,r,target);
            }
            return binarySearch(nums,l,mid-1,target);
        }

        return mid;

    }
}
