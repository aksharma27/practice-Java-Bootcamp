package com.company;

import java.util.Scanner;

//Q1: using loops print the factors of a number
public class Pract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        //our input
//        System.out.println("You entered "+x);
        int i = 1;
        System.out.println("factors of "+x +" are");//checking purpose
        while (i<=x){
            if(x%i ==0){
            System.out.println(i+" ");
            }
            i++;
        }
    }

}
