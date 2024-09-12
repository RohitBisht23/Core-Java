public class ClientClass {

    public static void main(String[] args) {
        DBConnection conObject = DBConnection.getInstance();
        conObject.printHere();
        
    }
}
