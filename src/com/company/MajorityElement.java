package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int keyOfMaxValue = 0;
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])) {
                numbers.put(nums[i], 1);
            } else {
                numbers.computeIfPresent(nums[i], (k, v) -> ++v);
            }
        }
        int maxValueInMap = (Collections.max(numbers.values()));

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                keyOfMaxValue = entry.getKey();
                break;
            }
        }
        return keyOfMaxValue;
    }
}
