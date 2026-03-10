package Module7;

public class StableUnstableSort {
        public static void main(String[] args) {

            System.out.println("Stable Sorting Algorithms:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Merge Sort");

            System.out.println("\nUnstable Sorting Algorithms:");
            System.out.println("1. Selection Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Heap Sort");

            // Example explanation
            int[] values = {5, 3, 5};

            System.out.println("\nExample Array: 5(A), 3(B), 5(C)");
            System.out.println("If after sorting -> 3(B), 5(A), 5(C)");
            System.out.println("Relative order of 5(A) and 5(C) remains same -> Stable");
        }
    }

