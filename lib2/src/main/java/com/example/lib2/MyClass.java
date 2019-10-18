package com.example.lib2;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "We are studying Java!!";
        System.out.println(s.charAt(10));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 6).toUpperCase());
        System.out.println(s.toLowerCase().substring(7));
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        String time = sc.next();
        String[ ] ar = time.split(":");
        int x = 0;
        x = Integer.parseInt(ar[0]);
        if(x<12) {
            x =x+12;

        }
        System.out.println(x +":"+ar[1]+":"+ar[2]);
    }
}