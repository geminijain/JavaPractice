package com.gemini.linkedList;

import java.util.Stack;

public class PalindromeLinkedList {

    // Node head; // head of list

    /* Linked list Node */
    public static class ListNode {
        char data;
        ListNode next;

        ListNode(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode('a');
        ListNode second = new ListNode('b');
        ListNode third = new ListNode('c');
        ListNode fourth = new ListNode('c');
        ListNode fifth = new ListNode('b');
        ListNode sixth = new ListNode('a');

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;

        Stack<ListNode> st = new Stack<ListNode>();
        ListNode current = head;
        while (current != null) {
            st.push(current);
            current = current.next;

        }

        PalindromeLinkedList testLL = new PalindromeLinkedList();
        boolean isPal = testLL.isPanlindrome(head, st);

        if (isPal) {
            System.out.println("This LinkedList is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
    }

    public boolean isPanlindrome(ListNode ll, Stack<ListNode> s) {
        boolean res = true;
        ListNode current = ll;
        while (current != null) {
            ListNode temp = s.pop();
            if (current.data != temp.data) {
                res = false;
                break;
            }
            current = current.next;
        }

        return res;
    }

}
