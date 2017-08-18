package com.gemini.java_practice.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityWise {
    public static void main(String[] args) {
        String[] addresses = { "Seattle, WA", "Spokane, WA",
                "Apple Valley, CA", "Dorchester, MA", "Bellevue, WA" };

        Map<String, List<String>> stateToCityMapping = new HashMap<>();

        for (int i = 0; i < addresses.length; i++) {
            String[] address = addresses[i].split(",");
            String city = address[0].trim();
            String state = address[1].trim();

            List<String> cities = new ArrayList<String>();

            if (stateToCityMapping.containsKey(state)) {
                cities = stateToCityMapping.get(state);
            }

            cities.add(city);

            stateToCityMapping.put(state, cities);
        }

        System.out.println(stateToCityMapping);
    }
}
