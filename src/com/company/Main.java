package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
           int n= in.nextInt();
           int h = n/3600;
        if (h>24){
            h -=24;
        }
           int min = (n%3600)/60;
           if (min>60){
               min -=60;
           }
           int sec = n%60;

           System.out.println(h+":"+(min/10)+(min%10)+":"+(sec/10)+(sec%10));
    }
}
