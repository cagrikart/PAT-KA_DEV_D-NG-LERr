   package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taban =1 , kuvvet=1;
        System.out.println("tabanı girin");
        taban= scanner.nextInt();
        System.out.println("kuvveti girin");
        kuvvet = scanner.nextInt();
        double sonuc =1 ;
            for (int i =1;i<=kuvvet;i++){
                sonuc = sonuc * taban;
            }
        System.out.println(sonuc);
    }
}
