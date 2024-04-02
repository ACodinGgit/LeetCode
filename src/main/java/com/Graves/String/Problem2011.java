package com.Graves.String;

public class Problem2011 {

    //Assuming valid input

    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String operation: operations){
            if(operation.contains("+")){ x++;}
            else {x--;}
        }
        return x;
    }
}
