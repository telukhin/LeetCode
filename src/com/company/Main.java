package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nickname = "genesis21";
        int password = 12345;

        while (true) {
            System.out.println("Enter your nickname :");
            String enteredLogin = scanner.next();

            if (enteredLogin.equals("q")) {
                System.out.println("You are out of system");
                break;
            }

            System.out.println("Enter your password :");
            int enteredPassword = scanner.nextInt();

            if (enteredLogin.equals(nickname) && password == enteredPassword) {
                System.out.println("Welcome " + nickname);
            } else {
                System.out.println("Error ! Please try again");
            }
        }
    }
}
