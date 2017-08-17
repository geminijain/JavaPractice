package com.gemini.kal.array;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateExpression {
    private static Set<Character> validOperators = new HashSet<>();

    public static void main(String[] args) {
        validOperators.add('*');
        validOperators.add('+');

        String input = "6*2*3+5";
        System.out.println(evaluate(input));
    }

    public static int evaluate(String expression) {
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                values.push(Character.getNumericValue(ch));
            } else if (validOperators.contains(ch)) {
                while (!operators.empty() && hasPrecedence(operators.peek())) {
                    values.push(compute(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(ch);
            } else {
                System.out.println("Ignoring invalid character: " + ch);
            }
        }
        while (!operators.empty()) {
            values.push(compute(operators.pop(), values.pop(), values.pop()));
        }
        return values.pop();
    }

    public static boolean hasPrecedence(char currentOperator) {
        return currentOperator == '*';
    }

    public static int compute(char op, int b, int a) {
        switch (op) {
        case '+':
            return a + b;
        case '*':
            return a * b;
        }
        throw new RuntimeException("Invalid operator: " + op);
    }
}
