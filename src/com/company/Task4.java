package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 40, 21, 22, 4, 5, 3, 4, 5};
        Arrays.sort(arr);
        int[] temp = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(temp));
        int lengthArray = arr.length;
        lengthArray = remove_Duplicate_Elements(arr, lengthArray);
        for (int i = 0; i < lengthArray; i++)
            System.out.print(arr[i] + " ");
    }

    public static int remove_Duplicate_Elements(int arr[], int a) {
        if (a == 0 || a == 1) {
            return a;
        }
        int[] tempA = new int[a];
        int j = 0;
        for (int i = 0; i < a - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempA[j++] = arr[i];
            }
        }
        tempA[j++] = arr[a - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = tempA[i];
        }
        return j;
    }


}
