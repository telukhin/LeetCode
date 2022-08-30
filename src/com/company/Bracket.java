package com.company;

public class Bracket {
    public static boolean validParentheses(String parens) {
        int counter = 0;
        byte[] characters = parens.getBytes();
        for (byte character : characters) {
            if (character == '(') {
                counter++;
            } else if (character == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        return counter == 0;
    }
}
