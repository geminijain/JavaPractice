package com.gemini.linkedList;

import java.util.LinkedList;

public class ImplementLinkedList {

    public static void main(String[] args) {

        // create object of linked list
        LinkedList<String> object = new LinkedList<String>();

        object.add("all");
        object.add("is");
        object.add("very");
        object.add("well");
        System.out.println(object);

        // find if linked list contains "is"
        if (object.contains("is")) {
            System.out.println("linkedlist contains is");
        } else {
            System.out.println("linkedlist does not contains is");
        }

        // number of elements in the linked list
        int size = object.size();
        System.out.println("number of elements in linked list are : " + size);

        // remove elements from linked list
        object.remove("very");
        System.out.println(object);
        object.remove(2);
        System.out.println(object);
        object.removeFirst();
        System.out.println("Linked list after first deletion: " + object);
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);
    }

}
