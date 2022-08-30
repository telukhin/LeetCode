package com.company;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] newArray = new int[]{0,0,0,12,1};
        moveZeroes(newArray);
        System.out.println(Arrays.toString(newArray));
    }
    public static void moveZeroes(int[] nums) {
        int swapIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[swapIndex];
                nums[swapIndex++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
