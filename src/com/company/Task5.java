package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на проверку");
        validateNumber(scanner.nextInt());
    }

    private static void validateNumber(int number) {
        checkForPositivityOrNegativity(number);
        System.out.println("Number is prime: " + isPrime(number));
        System.out.println("Number is divisible by 2,3,5,6,9: " + isDividedWithoutRemainder(number));
    }

    private static void checkForPositivityOrNegativity(int number) {
        if (number > 0) {
            System.out.println("You entered a positive num");
        } else if (number < 0) {
            System.out.println("You entered a negative num");
        } else {
            System.out.println("You entered zero");
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDividedWithoutRemainder(int number) {
        return number % 2 == 0 && number % 3 == 0 && number % 5 == 0;
    }
}
