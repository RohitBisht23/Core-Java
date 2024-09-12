
public class DBConnection {
    private volatile static DBConnection conObject;

    private DBConnection(){};

    public static DBConnection getInstance() {
        if(conObject == null) {
            synchronized(DBConnection.class) {
                if(conObject == null) {
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }

    public void print() {
        System.out.println("Print here");
    }
}
