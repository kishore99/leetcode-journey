//PS::https://leetcode.com/problems/rotate-array/submissions/
//23-02-2022
//Java

class Solution {
    public void reverse(int[] arr, int left, int right){
        while(left < right)
		{  // swap till the array is reversed
      // helloo 1 2 45
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;//increment by 1
            right--;
        }
    }
    public void rotate(int[] nums, int k) {

        k = k % nums.length;  // This will be highly effiecient when  k > nums.length

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
