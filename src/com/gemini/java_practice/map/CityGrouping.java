package com.gemini.java_practice.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class CityGrouping {

    public static void main(String[] args) {
        String[] addresses = { "Seattle, WA", "Bellevue, WA", "Portland, OR",
                "Spokane, WA" };

        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < addresses.length; i++) {
            String[] address = addresses[i].split(",");
            String city = address[0].trim();
            String state = address[1].trim();

            if (hm.containsKey(state)) {
                String temp = hm.get(state);
                hm.put(state, city + "," + temp);
            }

            else {
                hm.put(state, city);
            }

        }

        for (Entry<String, String> cityPair : hm.entrySet()) {
            System.out.println(cityPair.getKey() + "=>" + cityPair.getValue());
        }
    }

}
