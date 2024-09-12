public class DBConnection {
    private static DBConnection conObject = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        return conObject;
    }

    public void print() {
        System.out.println("This is called through single object.");
    }
}
