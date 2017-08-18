package com.gemini.java_practice.stack;

import java.util.Stack;

public class ReverseStackV1 {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("original stack : " + st);

        reverse();

        System.out.println("Reverse stack :" + st);

    }

    static void reverse() {
        if (st.size() > 0) {
            int x = st.peek();
            st.pop();
            reverse();

            insert_at_bottom(x);
        }
    }

    static void insert_at_bottom(int x) {
        if (st.isEmpty())
            st.push(x);
        else {
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }
}