package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String outputStr = "";

        System.out.println("Enter a letter:");
        String letterIn = input.next();
        System.out.println("Enter a number:");
        int numIn = input.nextInt();
        int indexAt = alphaString.indexOf(letterIn);
        outputStr = letterIn;
        for (int i = (numIn - 1); i > 0; i--) {
            if (indexAt == 0) {
                indexAt = 25;
            }
            else {
                indexAt -= 1;
            }
            outputStr += alphaString.charAt(indexAt);
        }
        System.out.println(outputStr);
    }
}
