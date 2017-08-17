package com.gemini.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AccessLog {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("D:\\AccessLog.txt");
        Map<Integer, Map<String, Boolean>> logData = getLogData(file);

        // Print the logData
        for (Entry<Integer, Map<String, Boolean>> entries : logData.entrySet()) {
            System.out.println(entries.getKey() + " => " + entries.getValue());
        }

        Set<String> Result = getUniquePageOccurences(1, logData);
        System.out.println(Result);
    }

    private static Set<String> getUniquePageOccurences(Integer customerId,
            Map<Integer, Map<String, Boolean>> logData) {
        Set<String> uniqueOccurence = new HashSet<>();
        if (logData.containsKey(customerId)) {
            Map<String, Boolean> pageOccurence = logData.get(customerId);

            for (Entry<String, Boolean> entry : pageOccurence.entrySet()) {
                if (entry.getValue()) {
                    uniqueOccurence.add(entry.getKey());
                }
            }
        }

        return uniqueOccurence;
    }

    private static Map<Integer, Map<String, Boolean>> getLogData(FileReader file)
            throws Exception {
        BufferedReader br = new BufferedReader(file);

        Map<Integer, Map<String, Boolean>> logData = new HashMap<>();

        String line = br.readLine();
        while (line != null) {
            String[] message = line.split(" ");
            int customerId = Integer.parseInt(message[0]);
            String pageName = message[2];

            if (logData.containsKey(customerId)) {
                // get existing pageInfo
                Map<String, Boolean> pageInfo = logData.get(customerId);
                boolean isFirstOccurence = !pageInfo.containsKey(pageName);
                // Update pageInfo
                pageInfo.put(pageName, isFirstOccurence);
                logData.put(customerId, pageInfo);
            } else {
                HashMap<String, Boolean> pageCount = new HashMap<>();
                pageCount.put(pageName, true);
                logData.put(customerId, pageCount);
            }

            line = br.readLine();
        }
        br.close();

        return logData;
    }
}
