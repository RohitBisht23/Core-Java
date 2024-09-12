public class DBConnection {
    private static DBConnection conObject;

    private DBConnection(){}

    public synchronized static DBConnection getInstance() {
        if(conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }

    public void printHere() {
        System.out.println("Here it is printing");
    }
}
