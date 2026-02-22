package week3.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
public class ArrayListUtils {

    public static <T> void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        if (list.isEmpty()) return null;
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static <T> ArrayList<T> filter(ArrayList<T> list, Predicate<T> condition) {
        ArrayList<T> result = new ArrayList<>();
        for (T item : list) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <T> void reverse(ArrayList<T> list) {
        Collections.reverse(list);
    }

    public static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static <T extends Number> double sum(ArrayList<T> numbers) {
        double total = 0;
        for (T n : numbers) total += n.doubleValue();
        return total;
    }

    public static <T extends Number> double average(ArrayList<T> numbers) {
        if (numbers.isEmpty()) return 0;
        return sum(numbers) / numbers.size();
    }

    public static <T extends Number & Comparable<T>> ArrayList<T> filterAbove(ArrayList<T> numbers, T threshold) {
        ArrayList<T> result = new ArrayList<>();
        for (T n : numbers) {
            if (n.compareTo(threshold) > 0) {
                result.add(n);
            }
        }
        return result;
    }


    public static double sumNumbers(ArrayList<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) total += n.doubleValue();
        return total;
    }

    public static void addNumbers(ArrayList<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void printList(ArrayList<?> list) {
        for (Object o : list) System.out.println(o);
    }
}