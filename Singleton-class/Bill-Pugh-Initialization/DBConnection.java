
public class DBConnection {
    private DBConnection(){}

    public static class DBConnectionHelper {
        private static final DBConnection INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return DBConnectionHelper.INSTANCE;
    }

    public void print(){
        System.out.println("Yes created successfully and fastly");
    } 
}
