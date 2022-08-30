package com.company;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("abaa", "aaba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean isConstruct = true;
        HashMap<Byte, Integer> hashMap = new HashMap<>();
        byte[] ransomNoteBytes = ransomNote.getBytes();
        byte[] magazineBytes = magazine.getBytes();
        for (byte magazineByte : magazineBytes) {
            if (!hashMap.containsKey(magazineByte)) {
                hashMap.put(magazineByte, 1);
            } else {
                hashMap.computeIfPresent(magazineByte, (k, v) -> ++v);
            }
        }
        for (byte ransomNoteByte : ransomNoteBytes) {
            if (!hashMap.containsKey(ransomNoteByte) || hashMap.get(ransomNoteByte) == 0) {
                isConstruct = false;
            } else {
                if (hashMap.get(ransomNoteByte) > 0) {
                    hashMap.computeIfPresent(ransomNoteByte, (k, v) -> --v);
                }
            }
        }
        return isConstruct;
    }
}
