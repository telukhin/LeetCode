package com.company;

public class FindOdd {
    public static int findIt(int[] a) {
        if (a.length == 1) {
            return a[0];
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                int counter = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        counter++;
                    }
                }
                if (counter % 2 == 1) {
                    return a[i];
                }
            }
        }
        return a[0];
    }
}
