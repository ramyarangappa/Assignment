package Module11;

    // LeetCode 232 - Queue using Stacks
import java.util.Stack;

     class QueueStack {

        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        static void push(int x){
            s1.push(x);
        }

        static int pop(){
            if(s2.isEmpty())
                while(!s1.isEmpty())
                    s2.push(s1.pop());

            return s2.pop();
        }

        public static void main(String[] args){
            push(1);
            push(2);
            System.out.println(pop());
        }
    }

