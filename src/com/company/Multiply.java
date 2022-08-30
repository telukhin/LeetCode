package com.company;

public class Multiply {
    public static String[] split(String s) {
        s = (s.length() % 2 == 0) ? s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
}
