package com.company;

import java.util.ArrayList;
import java.util.List;

public class PascalNumber {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        // Create an array list to store the output result...
        List<List<Integer>> output = new ArrayList<>();
        // Base cases...
        if (numRows <= 0) return output;
        // Create an array list to store the prev triangle value for further addition...
        ArrayList<Integer> prev = new ArrayList<>();
        // Inserting for the first row & store the prev array to the output array...
        prev.add(1);
        output.add(prev);
        // For rest of the rows, Traverse all elements through a for loop...
        for (int i = 2; i <= numRows; i++) {
            // Create another array to store the current triangle value...
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);    //first
            // Calculate for each of the next values...
            for (int j = 0; j < prev.size() - 1; j++) {
                // Inserting the addition of the prev arry two values...
                curr.add(prev.get(j) + prev.get(j + 1));    //middle
            }
            // Store the number 1...
            curr.add(1);    //last
            // Store the value in the Output array...
            output.add(curr);
            // Set prev is equal to curr...
            prev = curr;
        }
        return output;      // Return the output list of pascal values...
    }
}
