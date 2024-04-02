package com.Graves.Counting;

import java.util.HashMap;
import java.util.Map;

public class Problem169 {

    //Could potentially improve by having value returned once a majority value is found, instead of continuing the loop to the end
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (Integer number: nums){
            if(!frequency.containsKey(number)){
                frequency.put(number, 1);
            } else{
                frequency.put(number, frequency.get(number) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if(entry.getValue() > nums.length/2) return entry.getKey();
        }
        return -1;
    }
}
