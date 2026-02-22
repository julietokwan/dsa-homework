package week3.homework2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVsArrayDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Array length: " + arr.length);

        arr[2] = 99;
        System.out.println("Array after modification: " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("\nArrayList: " + list);
        System.out.println("ArrayList size: " + list.size());

        list.set(2, 99);
        System.out.println("ArrayList after modification: " + list);

        list.add(50);
        System.out.println("After adding 50: " + list);

        list.remove(1);
        System.out.println("After removing index 1: " + list);
    }
}