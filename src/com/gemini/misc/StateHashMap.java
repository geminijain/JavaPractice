package com.gemini.misc;

import java.util.HashMap;
import java.util.Map.Entry;

public class StateHashMap {
    public static void main(String[] args) {
        String[] address = { "Seattle, WA", "Spokane, WA", "AppleValley, CA",
                "Dorchester, MA", "Bellevue, WA" };

        HashMap<String, String> cityState = new HashMap<>();

        for (int i = 0; i < address.length; i++) {
            String[] str = address[i].split(",");
            String city = str[0].trim();
            String state = str[1].trim();

            if (cityState.containsKey(state)) {
                String temp = (String) cityState.get(state);
                cityState.put(state, city + ", " + temp);
            } else {
                cityState.put(state, city);
            }
        }

     //   System.out.println(cityState);
        cityState.entrySet();
        for (Entry<String, String> entry : cityState.entrySet()){
            System.out.println(entry.getKey() +" =>" + entry.getValue());
        }
    }
}
