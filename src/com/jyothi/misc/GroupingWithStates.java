package com.jyothi.misc;

public class GroupingWithStates {
    public static void main(String[] args) {
        String[][] city = { { "Seattle", "WA" }, { "Spokane", "WA" },
                { "Apple Valley", "CA" }, { "Dorchester", "MA" },
                { "Bellevue", "WA" } };
        String newArray = "";
        for (int i = 0; i < city.length - 1; i++) {
            System.out.println(city[i][1] + ":" + city[i][0]);
            for (int j = i + 1; j < city.length; j++) {
                if (city[i][1] == city[j][1]) {
                    newArray = city[j][0];
                    System.out.println(newArray);
                }
            }
        }
    }
}
