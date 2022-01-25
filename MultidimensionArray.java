package com.company;

import java.util.Arrays;

public class MultidimensionArray {

    public static void main(String[] args) {
	int[][] multarr ={{2,3,4,5,6,7,7},
            {2,99,56,100,300},
            {34,99,21,101}
        };
        System.out.println(multarr[1][4]);
        change(multarr);
        System.out.println(multarr[1][4]);
    }
    static void change(int[][] arr){
        arr[1][4]=900;
    }
}
//{2,3,4,54,56}
//{ {344,4,5,6,7,4},{3556,23,5,6,7,3,33,56} }