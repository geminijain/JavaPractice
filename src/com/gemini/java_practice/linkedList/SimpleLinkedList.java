package com.gemini.java_practice.linkedList;

public class SimpleLinkedList {

    private void display(ListNode head){
        if(head == null){
            return;
            }
        ListNode current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
            }
        System.out.println(current);
    }
    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third  = new ListNode(3);
        ListNode fourth = new ListNode(4);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        
       SimpleLinkedList simpleLL = new SimpleLinkedList();
       simpleLL.display(head);
        }
    }

