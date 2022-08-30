package com.company;

public class Square {
    public static boolean isSquare(int n) {
        if (n < 0 || n == 2 || n == 3) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            for (int i = 1; i <= n/2; i++) {
                if  (i * i == n) {
                    return true;
                } else if (i * i > n) {
                    return false;
                }
            }
            return true; // fix me!
        }
    }
}

