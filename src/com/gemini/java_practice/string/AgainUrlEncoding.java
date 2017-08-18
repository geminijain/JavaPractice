package com.gemini.java_practice.string;

public class AgainUrlEncoding {

    public static void main(String[] args) throws Exception {
        String input = "Mr John Smith    ";
        char[] output = urlCoding(input);

        System.out.println(output);
    }

    public static char[] urlCoding(String str) throws Exception {
        char[] chstr = str.toCharArray();
        if (str == null || str.isEmpty()) {
            throw new Exception("String cannot be empty");

        } else {

            int size = chstr.length - 1;
            int jstart = 0;

            for (int i = size; i > 0; i--) {
                if (chstr[i] != ' ') {
                    jstart = i;
                    break;
                }

            }

            for (int j = jstart; j > 0; j--) {
                if (chstr[j] != ' ') {
                    chstr[size] = chstr[j];
                    size = size - 1;
                } else  {
                    chstr[size] = '0';
                    chstr[size - 1] = '2';
                    chstr[size - 2] = '%';
                    size = size - 3;
                }
            }

        }
        return chstr;
    }

}
