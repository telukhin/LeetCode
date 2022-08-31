package com.company;

import java.util.Arrays;

public class OddElementsNotDistinct {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(findSameElementsStandingOnOddPositions(
                new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9}))));
    }

    public static int[] findSameElementsStandingOnOddPositions(int[] input) {
        StringBuilder s = new StringBuilder();
        int[] temp = new int[input.length];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j] && (i % 2 == 1 || j % 2 == 1) &&
                        (!s.toString().contains(String.valueOf(input[i])) || s.length() == 0)) {
                    temp[index] = input[i];
                    index++;
                    s.append(input[i]);
                    break;
                }
            }
        }
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}
