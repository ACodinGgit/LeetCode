package com.Graves.LeetCode75.PrefixSum;

public class Problem724 {

    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(isLeftAndRightSumEqual(nums, i)) return i;
        }
        return -1;
    }

    private static int leftSum(int[] nums, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        return sum;
    }
    private static int rightSum(int[] nums, int k){
        int sum = 0;
        for (int i = k+1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    private static boolean isLeftAndRightSumEqual(int[] nums, int k){
        return leftSum(nums, k) == rightSum(nums, k);
    }

}
