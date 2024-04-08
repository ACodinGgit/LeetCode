package com.Graves.LeetCode75.BitManipulation;

public class Problem338 {
    public int[] countBits(int n) {
        int[] numberOfOnes = new int[n+1];
        for (int i = 0; i <= n; i++) {
            numberOfOnes[i] = Integer.bitCount(i);
        }
        return numberOfOnes;
    }
}
