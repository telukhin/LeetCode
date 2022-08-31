package com.company;

public class ImplementingStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello","llo"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.indexOf(needle) > 0) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
