public class SortingHomework {
    static int comparisons;
    static int swaps;

    public static void main(String[] args) {

        int[] increasing = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse =    {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] random =     {5, 1, 9, 3, 7, 2, 8, 6, 4, 0};

        System.out.println("=== Increasing Input ===");
        runAll(increasing);

        System.out.println("\n=== Reverse Input ===");
        runAll(reverse);

        System.out.println("\n=== Random Input ===");
        runAll(random);
    }

    public static void insertionSort(int[] arr) {
        comparisons = 0;
        swaps = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        comparisons = 0;
        swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        comparisons = 0;
        swaps = 0;

        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void runAll(int[] original) {
        int[] a1 = java.util.Arrays.copyOf(original, original.length);
        int[] a2 = java.util.Arrays.copyOf(original, original.length);
        int[] a3 = java.util.Arrays.copyOf(original, original.length);

        insertionSort(a1);
        System.out.println("Insertion Sort: comparisons = " + comparisons + ", swaps = " + swaps);

        selectionSort(a2);
        System.out.println("Selection Sort: comparisons = " + comparisons + ", swaps = " + swaps);

        bubbleSort(a3);
        System.out.println("Bubble Sort:    comparisons = " + comparisons + ", swaps = " + swaps);
    }
}