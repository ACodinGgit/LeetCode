package com.Graves.LeetCode75.PrefixSum;

public class Problem1732 {

    public int largestAltitude(int[] gain) {
        int highestPoint = 0;
        int currentPoint = 0;
        for (int i = 0; i < gain.length; i++) {
            currentPoint += gain[i];
            highestPoint = Math.max(highestPoint, currentPoint);
        }
        return highestPoint;
    }
}
