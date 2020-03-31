package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        int c = new Random().nextInt(100);
        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0) {
            System.out.println(c);
        }
    }
}
