package com.company;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] stringArr = sentence.split(" ");
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() >= 5) {
                StringBuilder stringBuilder = new StringBuilder(stringArr[i]);
                stringArr[i] = stringBuilder.reverse().toString();
            }
        }
        return String.join(" ",stringArr);
    }
}
