package com.gemini.java_practice.string;

public class AgainPermutationTwoStringPart2 {

    public static void main(String[] args) throws Exception {
        String str1 = "";
        String str2 = "k";
        boolean output = isPermutation(str1, str2);

        if (output) {
            System.out.println("This strings are permutation");
        } else {
            System.out.println("this strings are not permutation");
        }

    }

    public static boolean isPermutation(String st1, String st2) throws Exception {
        boolean isPermute = true;
        if (st1 == null || st2 == null || st1.isEmpty() || st2.isEmpty()) {
            throw new Exception("Strings cannot be Empty");
        }
        StringBuilder stbuild = new StringBuilder(st2);
        for (int i = 0; i < st2.length(); i++) {
            for (int j = 0; j < stbuild.length(); j++) {
                if (st1.charAt(i) == stbuild.charAt(j)) {
                    stbuild.deleteCharAt(j);

                }
            }
        }
        if (stbuild.length() != 0) {
            isPermute = false;
        }

        return isPermute;

    }

}
