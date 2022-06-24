   package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i , sayi,kat4=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz");
        sayi = scanner.nextInt();
        for( i =1;i<sayi;i *=4) {
            System.out.println(i);
        }
        for (int j=1;j<sayi;j*=5){
            System.out.println(j);
        }

    }
}
