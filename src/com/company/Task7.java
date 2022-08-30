package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String[] stringArray = {"anger", "awe", "joy", "grief", "love"};

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        byte[] scannerBytes = s.getBytes();
        int wordsCounter = 0;

        for (int i = 0; i < stringArray.length; i++) {
            byte[] stringBytes = stringArray[i].getBytes();
            int counter = 0;
            for (int j = 0; j < stringBytes.length; j++) {
                for (int k = 0; k < scannerBytes.length; k++) {
                    if (stringBytes[j] == scannerBytes[k]) {
                        counter++;
                        break;
                    }
                }
                if (stringArray[i].length() == counter) {
                    wordsCounter++;
                }
            }
        }
        System.out.println(wordsCounter);
    }
}
