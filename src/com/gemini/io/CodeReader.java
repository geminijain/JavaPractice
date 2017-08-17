package com.gemini.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class CodeReader {

    public static void main(String[] args) throws Exception {
        FileReader readerObj = new FileReader("D:\\Logs2.txt");
        BufferedReader br = new BufferedReader(readerObj);

        try {
            String line = br.readLine();

            HashMap<Integer, Integer> hm = new HashMap<>();
            while (line != null) {
                String[] message = line.split(" ");
                if (message.length == 2) {
                    int code = Integer.parseInt(message[2].trim());

                    if (hm.containsKey(code)) {
                        int temp = hm.get(code);
                        hm.put(code, temp + 1);
                    } else {
                        hm.put(code, 1);
                    }
                    line = br.readLine();
                } else {
                    throw new Exception("Log file is not correctly formatted.");
                }
            }

            for (Entry<Integer, Integer> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + "=>" + entry.getValue());
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (readerObj != null) {
                readerObj.close();
            }

            if (br != null) {
                br.close();
            }
        }

    }
}
