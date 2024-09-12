public class Print<K, V> {
    private K key;
    private V value;

    Print(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Return the key
    public K keyMethod() {
        return key;
    }

    // Print the color
    public void printColor(K color) {
        System.out.println("color is :" + color);
    }
}