package com.example.lib;

public class MyClass {

    public static void main(String[] args) {

        String s ="We are studying Java!!";
        System.out.println(s.charAt(10));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0,6).toUpperCase());
        System.out.println(s.toLowerCase().substring(7));
        for(int i=s.length()-1 ; i>=0;i--) {
            System.out.println(s.charAt(i));
        }



       }
    }

}
