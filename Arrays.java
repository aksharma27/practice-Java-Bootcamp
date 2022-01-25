package com.company;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[6];     // 0 to 5 = 6 indexes
        arr[0]=1;
        arr[1]=45;
        arr[2]=10;
        arr[3]=11;
        arr[4]=100;
        arr[5]=167;
        System.out.println("value of array" +
                "at index " + 3+" is" +arr[3]);
            for (int i = 0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
//        System.out.println(Arrays.toString(obj));
    }
}
