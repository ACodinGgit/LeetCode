package com.Graves.LeetCode75.BitManipulation;

import java.util.ArrayList;

public class Problem136 {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
}
