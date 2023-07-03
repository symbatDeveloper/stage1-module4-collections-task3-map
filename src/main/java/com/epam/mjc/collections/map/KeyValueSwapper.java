package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map1 = new HashMap<>();
       for( Map.Entry< Integer, String> enry : sourceMap.entrySet()){
          Integer newVal = enry.getKey();
          String newKey = enry.getValue();
          if(!map1.containsKey(newKey)){
              map1.put(newKey, newVal);
          }
          else if(map1.get(newKey)> newVal){
              map1.put(newKey, newVal);
          }
       }

        return map1;
    }
}
