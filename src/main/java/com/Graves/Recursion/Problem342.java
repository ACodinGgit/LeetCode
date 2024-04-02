package com.Graves.Recursion;

public class Problem342 {

    public boolean isPowerOfFour(int n) {
        if(n == 4 || n == 1) return true;
        if(n == 0) return false;
        if(n % 4 != 0) return false;
        return isPowerOfFour(n/4);
    }
}
