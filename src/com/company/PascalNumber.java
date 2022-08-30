package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalNumber {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++) {
            List<Integer> prevList = res.get(i-1);
            List<Integer> currList = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==i || j==0) currList.add(1);
                else currList.add(prevList.get(j) + prevList.get(j-1));
            }
            res.add(currList);
        }
        return res;
    }
}
