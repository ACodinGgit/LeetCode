package com.Graves.NumberTheory;

public class Problem2427 {

    public int commonFactors(int a, int b) {

        //for numbers 1-a check if they are a factor of a, and if so then check if factor of b
        //1 could be assumed to be a common factor
        //a could be assumed to be a factor of itself
        //for the sake of code simplicity they will still be checked in the loop

        int numberOfCommonFactors = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    numberOfCommonFactors++;
                }
            }
        }
        return numberOfCommonFactors;
    }
}
