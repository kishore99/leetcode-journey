//PS::https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
//22-02-2022
//Java

class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        //looping
        for(int k = n-1; k>=0; k--){

            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }else{
                result[k] = arr[j] * arr[j];
                j--;
            }

        }
        return result;
    }
}
