package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
       if(sentence.length() == 0){
        return map;
       }
       String[] words = sentence
               .replaceAll("[,.]", "")
               .toLowerCase()
               .split(" ");
        for(String wordOf : words){
            if(map.containsKey(wordOf)){
                map.put(wordOf, map.get(wordOf)+1);
            }
            else{
                map.put(wordOf,1);
            }
        }
        return map;
    }
}
