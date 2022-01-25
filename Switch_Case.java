package com.company;

import java.util.Scanner;

public class Switch_Case {

    public static void main(String[] args) {
        System.out.println("Enter day number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("you entered "+n);
        switch (n){
            case 1:
                System.out.println("Sunday");
                    break;
        case 2:
                System.out.println("Mon");break;
        case 3:
            System.out.println("Enter the month");
            int m = in.nextInt();
               switch (m){      //nested switch case
                   case 1:
                       System.out.println("jan");break;
               case 2:
                       System.out.println("feb");break;
               }
               break;
        case 4:
                System.out.println("Wed");break;
        case 5:
                System.out.println("Thrs");break;
        case 6:
                System.out.println("Fri");break;
        case 7:
                System.out.println("Sat");break;
            default:
                System.out.println("You entered wrong input");
        }
    }
}
