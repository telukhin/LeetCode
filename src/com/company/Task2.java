package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your birthday year :");
//        int currentYear = 2022;
//        int enteredYear = scanner.nextInt();
//        System.out.println("You are " + (currentYear - enteredYear) + " years old.");
//        System.out.println();
//
//        System.out.println("Enter your weight :");
//        double weight = scanner.nextDouble();
//        System.out.println("Your weight on the moon : " + (weight * 1.6) + " N");
//
//
//        System.out.println("Enter your Surname : ");
//        String surname = scanner.next();
//        System.out.println("Enter your Name: ");
//        String name = scanner.next();
//        System.out.println("Enter your Second name : ");
//        String name2 = scanner.next();
//        System.out.println(" Your surname is " + surname + "\n Your name is " + name + "\n Your second name is " + name2);
//
//
        System.out.println("Enter number of month: 1-2-3-4-5-6-7-8-9-10-11-12: ");
        String myMonth = scanner.nextLine();
        switch (myMonth) {
            case "12":
            case "1":
            case "2":
                System.out.println("You entered Winter's month ");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("You entered Spring's month ");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("You entered Summer's month ");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("You entered Autumn's month ");
                break;
            default:
                System.out.println("You entered a defunct month ");
        }


//        long humanityStart = 7_500_000_000L;
//        long humanityInOneYear = (long) (humanityStart * 1.1);
//        long humanityInTwoYear = (long) (humanityInOneYear * 1.1);
//        long humanityInThreeYear = (long) (humanityInTwoYear * 1.1);
//        System.out.println("Humanity population is 7_500_000_000 now. ");
//        System.out.println("Humanity population increased every year by 10%. In three year humanity will raise to " + humanityInThreeYear);


//        System.out.println("Enter two numbers :");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int min = (num1<num2) ? num1 : num2;
//        System.out.println("The lower number among these two numbers is "+min);


//        System.out.println("Enter three numbers : ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        if (num1 < num2) {
//            System.out.println("The highest number :" + num2 + "The smallest number " + num1 + "middle number" + num3);
//        }

//        if (num1 > num2 && num2 > num3) {
//            System.out.println("The highest number :" + num1 + " The smallest number " + num3);
//        } else if (num1 > num2 && num3 > num2) {
//            System.out.println("The highest number :" + num1 + " The smallest number " + num2);
//        } else if (num2 > num1 && num1 > num3) {
//            System.out.println("The highest number :" + num2 + " The smallest number " + num3);
//        } else if (num2 > num1 && num3 > num1) {
//            System.out.println("The highest number :" + num2 + " The smallest number " + num1);
//        } else if (num2 > num1) {
//            System.out.println("The highest number :" + num3 + " The smallest number " + num1);
//        } else {
//            System.out.println("The highest number :" + num3 + " The smallest number " + num2);
//        }

    }
}
