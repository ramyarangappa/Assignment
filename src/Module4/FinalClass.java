package Module4;


    final class FinalClass {
        final int x = 10;

        final void show() {
            System.out.println("Final Method");
        }
    }

    class TestFinal {
        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            System.out.println(obj.x);
            obj.show();
        }
    }

