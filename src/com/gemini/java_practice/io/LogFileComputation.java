package com.gemini.java_practice.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LogFileComputation {

    public static void main(String[] args) throws Exception {
        FileReader readerObj = new FileReader("D:\\LogFile.txt");
        BufferedReader br = new BufferedReader(readerObj);
        String delimeter = "\\t";

        String line = br.readLine();

        Map<String, Integer> pageCount = new TreeMap<>();

        while (line != null) {
            String[] str = line.split(delimeter);
            String website = str[0].trim();

            if (pageCount.containsKey(website)) {
                int value = pageCount.get(website);
                pageCount.put(website, value + 1);
            } else {
                pageCount.put(website, 1);
            }

            line = br.readLine();
        }
        br.close();

        // We can easily sort a List using Collections.sort(listToSort)
        // But, Map is not a List!
        // But, we can get Set of entries from a Map using map.entrySet() method
        // that returns Set<Entry<K, V>>
        // Once we have the Set, we can create a List and sort it using
        // Collections.sort(list)
        Set<Map.Entry<String, Integer>> pageCountAsSet = pageCount.entrySet();

        // To create a new ArrayList we use default constructor with no
        // arguments i.e. new ArrayList<>()
        // If we want to create a new ArrayList with elements of existing
        // Collection
        // [Remember: Set and List both are a type of Collection],
        // we can use a different constructor of ArrayList
        // which takes existing Collection and creates a new ArrayList with
        // elements of that Collection.
        List<Map.Entry<String, Integer>> list = new ArrayList<>(pageCountAsSet);

        // Collections is a class that contains a method sort which takes any
        // collection
        // [Remember: Set and List are of type collection]
        // and sorts the given collection using the default compareTo() method
        // of the elements of that collection.
        // Incase we want to use another way to compare 2 elements of a
        // collection, we can write our own Comparator
        // and pass that as second argument to the Collections.sort() method.
        Collections.sort(list, new ValueComparator());

        // System.out.println(list);

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        int count = 1;
        for (Entry<String, Integer> entry : list) {
            if (count > 10) {
                break;
            }

            result.put((entry.getKey()), (entry.getValue()));
            count++;
        }

        System.out.println(result);
    }

    File file = new File("D:\\OutputLogFile.txt");
    /*
     * file.createNewFile();
     * 
     * FileWriter writer = new FileWriter(file); writer.write(result);
     */

    // This is a custom Comparator of type Entry<String, Integer>, that
    // compares
    // 2 entries based on there values.
    public static class ValueComparator
            implements Comparator<Entry<String, Integer>> {
        @Override
        public int compare(Entry<String, Integer> e1,
                Entry<String, Integer> e2) {
            // If we want ascending order, we can compare e1 with e2 i.e.
            // e1.getValue().compareTo(e2.getValue());
            // If we want descending order, we can compare e2 with e1 i.e.
            // e2.getValue().compareTo(e1.getValue());
            return e2.getValue().compareTo(e1.getValue());
        }
    }
}
