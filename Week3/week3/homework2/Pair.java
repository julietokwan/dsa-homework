package week3.homework2;

public class Pair<K, V> {

    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() { return first; }
    public void setFirst(K first) { this.first = first; }

    public V getSecond() { return second; }
    public void setSecond(V second) { this.second = second; }

    @Override
    public String toString() {
        return "Pair[" + first + ", " + second + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pair)) return false;

        Pair<?, ?> other = (Pair<?, ?>) obj;

        boolean firstEqual = (first == null ? other.first == null : first.equals(other.first));
        boolean secondEqual = (second == null ? other.second == null : second.equals(other.second));

        return firstEqual && secondEqual;
    }

    @Override
    public int hashCode() {
        int result = (first == null ? 0 : first.hashCode());
        result = 31 * result + (second == null ? 0 : second.hashCode());
        return result;
    }
}