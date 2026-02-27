public class MyVectorTest {
    public static void main(String[] args) {
        MyVector<Integer> v = new MyVector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Size: " + v.size());
        System.out.println("Get index 1: " + v.get(1));

        v.set(1, 99);
        System.out.println("After set: " + v.get(1));

        v.remove(0);
        System.out.println("After remove: " + v.get(0));
        System.out.println("Size now: " + v.size());
    }
}