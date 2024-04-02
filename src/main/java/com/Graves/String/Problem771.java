package com.Graves.String;

public class Problem771 {

    public int numJewelsInStones(String jewels, String stones) {

        int myJewels = 0;
        for (char stone: stones.toCharArray()){
            if(jewels.contains(String.valueOf(stone))) myJewels++;
        }
        return myJewels;
    }
}
