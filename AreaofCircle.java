package com.company;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner in = new Scanner(System.in);
        double rad = in.nextDouble();
//        A = PI*r*r;
        double area = Math.PI*(Math.pow(rad,2));
        System.out.println("Area of the circle is"+ area);
    }
}
