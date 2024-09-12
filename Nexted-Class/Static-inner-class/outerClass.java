public class outerClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    private static class staticInnerClass {
        void print() {
            System.out.println(classVariable);
        }
    }

    //below is used when inner class is private to involke the inner class using objed
    public void print() {
        staticInnerClass obj = new staticInnerClass();
        obj.print();
    }
}
