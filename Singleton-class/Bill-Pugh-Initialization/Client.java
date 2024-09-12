
public class Client {
    public static void main(String[] args) {
        DBConnection conObject = DBConnection.getInstance();
        conObject.print();
    }
}
