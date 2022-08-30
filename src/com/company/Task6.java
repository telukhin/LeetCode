package com.company;

public class Task6 {
    public static void main(String[] args) {
        String s = "qqqqqqwwwww";
        int counter = 0;
        byte[] bytes = s.getBytes();

        for (int i = 0; i < bytes.length-1; i++) {
            if (i == 0 && bytes[0] == bytes[1]) {
                counter++;
            } else if (i != 0 && bytes[i - 1] != bytes[i] && bytes[i] == bytes[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
