package com.Graves.LeetCode75.BitManipulation;

public class Problem1318 {

    public int minFlips(int a, int b, int c) {

        int flips = 0;

        for (int i = 0; i < 32; i++) {
            boolean aBit = getBitAt(a, i);
            boolean bBit = getBitAt(b, i);
            boolean cBit = getBitAt(c, i);

            if((aBit || bBit) == cBit) continue;

            if(aBit == bBit && aBit){
                 flips += 2;
            } else {
                flips++;
            }

        }
        return flips;
    }

    boolean getBitAt(int n, int i) {
        return ((n >> i) & 1) == 1;
    }
}
