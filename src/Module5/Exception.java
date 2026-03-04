package Module5;
    class MyException extends Exception{
        MyException(String msg) {
            super(msg);
        }
    }

    class CustomExceptionDemo {

        static void check(int age) throws MyException {
            if (age < 18)
                throw new MyException("Not Eligible");
            else
                System.out.println("Eligible");
        }

        public static void main(String[] args) {
            try {
                check(15);
            } catch (MyException e) {
                System.out.println(e);
            }
        }
    }

