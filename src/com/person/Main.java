package com.person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            String s = sc.next();
            oddAndEven(s);
        }
    }

    public static void oddAndEven(String s){
        String even="";
        String odd="";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb1.append(s.charAt(i));
            }else{
                sb2.append(s.charAt(i));
            }
        }
        even = sb1.toString();
        odd = sb2.toString();
        System.out.println(even + " " + odd);
    }
}
