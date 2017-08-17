package com.gemini.string;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterCount {

    public static void main(String[] args) {
        String input = "hdtgrdtdrfgbello";
        input.toLowerCase();

        char[] chrStr = input.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
         char ch = chrStr[i] ;
         int totalvalue = 1;
         if(hm.containsKey(ch)){
             totalvalue = hm.get(ch) + 1;
         }
         
         hm.put(ch, totalvalue);
         
        }
        for (Entry<Character, Integer> entry : hm.entrySet()){
           System.out.println(entry.getKey() +" = " +entry.getValue());
        }

    }

}
