package week3.homework2;

import java.util.ArrayList;

public class ArrayListOperationsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(3);
        nums.add(8);

        System.out.println("Original: " + nums);

        ArrayListUtils.swap(nums, 0, 2);
        System.out.println("After swap: " + nums);

        System.out.println("Max: " + ArrayListUtils.findMax(nums));

        ArrayListUtils.reverse(nums);
        System.out.println("Reversed: " + nums);

        System.out.println("Sum: " + ArrayListUtils.sum(nums));

        System.out.println("Average: " + ArrayListUtils.average(nums));

        System.out.println("Above 5: " + ArrayListUtils.filterAbove(nums, 5));

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(100);
        nums2.add(200);

        System.out.println("Merged: " + ArrayListUtils.merge(nums, nums2));

        System.out.println("Wildcard sum: " + ArrayListUtils.sumNumbers(nums));
    }
}