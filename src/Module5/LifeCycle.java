package Module5;

    class LifeCycle extends Thread {
        public void run() {
            System.out.println("Thread Running");
        }

        public static void main(String[] args) throws InterruptedException {
            LifeCycle t = new LifeCycle();

            System.out.println("State after creation: " + t.getState());

            t.start();
            System.out.println("State after start: " + t.getState());

            t.join();
            System.out.println("State after completion: " + t.getState());
        }
    }

