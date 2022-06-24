   package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int sayi=0,i,toplam =0;
       Scanner inScanner = new Scanner(System.in);
       sayi = inScanner.nextInt();
       for (i=0;i<sayi;i++) {
           if (i % 3 == 0 || i %4==0) {
               System.out.println(i);
               toplam += i;

           }
       }
        System.out.println(toplam/i);

    }
}
