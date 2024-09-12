public class outerClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    public class InnerClass {
        public void print() {
            // Accessing both instance and static variables from the outer class
            System.out.println(instanceVariable + classVariable);
        }
    }

   
}
