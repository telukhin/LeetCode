package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 3, 5}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = Integer.MAX_VALUE;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] < target) {
                low = mid + 1;
                if (nums[mid] < target && mid == nums.length - 1) {
                    return mid + 1;
                } else if (nums[mid] < target && nums[mid + 1] > target){
                    return mid + 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
                if (nums[mid] > target && mid == 0) {
                    return mid;
                } else if (nums[mid] > target && nums[mid - 1] < target) {
                    return mid;
                }
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
