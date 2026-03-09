package Module6;

public class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {1,2,4,5};
            int n = 5;

            int sum = n*(n+1)/2;

            int actual = 0;

            for(int x : arr)
                actual += x;

            System.out.println("Missing Number = " + (sum-actual));
        }
    }

