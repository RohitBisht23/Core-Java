public class DBConnection2 {
    private static DBConnection2 conObject;

    private DBConnection2(){}

    public static DBConnection2 getInstance() {
        if(conObject == null) {
            conObject = new DBConnection2();
        }
        return conObject;
    }

    public void print() {
        System.out.println("Called through object");
    }
}
