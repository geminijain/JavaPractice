package com.gemini.linkedList;

public class ReverseLinkedList {

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int num) {
            data = num;
            next = null;
        }

    }

    public ListNode reverse(ListNode node) {
        ListNode previous = null;
        ListNode current = node;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

    // print linked list
    void print(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ListNode obj1 = new ListNode(1);
        ListNode obj2 = new ListNode(2);
        ListNode obj3 = new ListNode(3);
        ListNode obj4 = new ListNode(4);

        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;

        ListNode head = obj1;

        ReverseLinkedList list = new ReverseLinkedList();
        System.out.println("Original LinkedList : ");
        list.print(head);

        head = list.reverse(head);
        System.out.println("\nReversed LinkedList : ");
        list.print(head);

    }

}