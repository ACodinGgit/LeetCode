package com.Graves.Recursion;

public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        if(n == 2 || n == 1) return true;
        if(n == 0) return false;
        if(n % 2 != 0) return false;
        return isPowerOfTwo(n/2);
    }
}
