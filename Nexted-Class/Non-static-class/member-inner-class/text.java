public class text {
    public static void main(String[] args) {
        outerClass outerObj = new outerClass();
        outerClass.InnerClass obj = outerObj.new InnerClass(); // Correct syntax for instantiation
        obj.print();
    }
}
