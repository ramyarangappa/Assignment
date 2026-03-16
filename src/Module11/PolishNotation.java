package Module11;

import java.util.Stack;
 class PolishNotation {
    // LeetCode 150 - Reverse Polish Notation

        public static void main(String[] args) {

            String[] tokens = {"2", "1", "+", "3", "*"};

            Stack<Integer> stack = new Stack<>();

            for (String s : tokens) {

                if (s.equals("+"))
                    stack.push(stack.pop() + stack.pop());

                else if (s.equals("-")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                }

                else if (s.equals("*"))
                    stack.push(stack.pop() * stack.pop());

                else if (s.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                }

                else
                    stack.push(Integer.parseInt(s));
            }

            System.out.println(stack.pop());
        }
    }

