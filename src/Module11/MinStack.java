package Module11;


    // LeetCode 155 - Min Stack
import java.util.Stack;

    public class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min = new Stack<>();

        void push(int x) {
            stack.push(x);

            if (min.isEmpty() || x <= min.peek())
                min.push(x);
        }

        void pop() {
            if (stack.pop().equals(min.peek()))
                min.pop();
        }

        int getMin() {
            return min.peek();
        }
    }

