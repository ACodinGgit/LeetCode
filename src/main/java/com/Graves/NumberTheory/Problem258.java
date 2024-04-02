package com.Graves.NumberTheory;

public class Problem258 {

    //input is assumed to be a positive int
    public int addDigits(int num) {

        if(num <=9) return num;

        String nString = Integer.toString(num);
        int sum = 0;
         for (char digit: nString.toCharArray()){
             sum += Integer.parseInt(String.valueOf(digit));
         }
        return addDigits(sum);
    }
}
