package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Бекзат";
        int age = 21;
        int temp = 1;

        if (age >= 20 & age <= 45 && temp <= 30 & temp >= -20) {
            System.out.println("Можно идти гулять");
        }

        if (age <= 20 && temp <= 28 & temp >= 0) {
            System.out.println("Можно идти гулят");
        }
        if (age >= 45 && temp <= 25 & temp >= -10) {
            System.out.println("Можно идти гулть");
        }
    }
}



