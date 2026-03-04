package Module5;

    // Using Thread class
    class RunnableInterface extends Thread {
        public void run() {
            System.out.println("Thread using Thread class");
        }
    }

    // Using Runnable interface
    class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread using Runnable interface");
        }
    }

    class ThreadDemo {
        public static void main(String[] args) {
            Thread t1 = new Thread();
            t1.start();

            Thread t2 = new Thread(new MyRunnable());
            t2.start();
        }
    }

