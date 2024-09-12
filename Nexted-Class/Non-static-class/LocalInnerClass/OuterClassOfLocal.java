
public class OuterClassOfLocal {
    int instanceVariable = 10;
    static int classVariable = 20;

    public void display() {
        int localVariable = 23;

        class localClass {
            int localClassVariable = 34;

            public void print() {
                System.out.println(localVariable + classVariable + localClassVariable + localVariable);
            }
        }

        localClass localObj = new localClass();
        localObj.print();
    }
}
