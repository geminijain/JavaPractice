package com.gemini.string;

public class AgainCompressString {

    public static void main(String[] args) {
        String str = "aabbbccccccaad";
        str.toLowerCase();
        char[] a = str.toCharArray();

        StringBuilder strb = new StringBuilder("");
        char temp = a[0];
        int count = 1;
        int totalcount = 0;
        for (int i = 1; i < a.length; i++) {

            if (a[i] == temp) {
                count = count + 1;

            } else  {
                totalcount = count;
                temp = a[i];
                count = 1;

            }
            if (count == 1) {
                strb.append(a[i - 1]);
                strb.append(totalcount);
            }

        }
        strb.append(temp);
        strb.append(count);

        if (strb.length() < str.length()) {
            System.out.println(strb);
        } else {
            System.out.println(str);
        }

    }
}