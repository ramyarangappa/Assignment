package Module4;

public class Garbagecollection {
        public void finalize() {
            System.out.println("Garbage Collected");
        }

        public static void main(String[] args) {
            Garbagecollection obj1 = new Garbagecollection();
            Garbagecollection obj2 = new Garbagecollection();

            obj1 = null;
            obj2 = null;

            System.gc();
        }
    }

