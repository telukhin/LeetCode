package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class EpamInterview {
    public static void main(String[] args) {
        List<String> twits = new ArrayList<>();
        twits.add("#Java and #Scala are the languages.");
        twits.add("Hello my friend and #Scala are the languages.");
        twits.add("my little pony #Java and #Scala are the #languages hello.");
        System.out.println(getWordsWithHashTag(twits));
    }
    public static List<String> getWordsWithHashTag(List<String> arrTwits) {
        List<String> allWordsWithHashTag = arrTwits.stream()
                .flatMap(twit -> Arrays.stream(twit.split(" ")).filter(s -> s.startsWith("#")))
                .collect(Collectors.toList());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : allWordsWithHashTag) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 1);
            } else {
                hashMap.computeIfPresent(s, (k, v) -> ++v);
            }
        }
        hashMap = hashMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return new ArrayList<>(hashMap.keySet());
    }
}
