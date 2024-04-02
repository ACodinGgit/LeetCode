package com.Graves.Counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem229 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (Integer number: nums){
            if(!frequency.containsKey(number)){
                frequency.put(number, 1);
            } else{
                frequency.put(number, frequency.get(number) + 1);
            }
        }

        Integer third = nums.length/3;
        List<Integer> results = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if(entry.getValue() > third) results.add(entry.getKey());
        }
        return results;
    }
}
