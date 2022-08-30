package com.company;

import java.util.HashMap;
import java.util.HashSet;

/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.



 */

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abccdfgh"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1){
            return s.length();
        }
        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0;
        int max = 0;
        int n=s.length();
        while(j<n){
            char c = s.charAt(j);
            if(!hs.contains(c)){
                hs.add(c);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max,hs.size());
        }
        return max;
    }
}
