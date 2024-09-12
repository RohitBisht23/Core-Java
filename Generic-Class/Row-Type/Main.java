public class Main {
    public static void main(String[] args) {
        //Normal generic object -> restriction only pass String type
        Print<String> obj1 = new Print();
        obj1.setValue("Hello");
        System.out.println(obj1.getPrintValue());

        //Row type object creating -> no restriction to pass data type
        Print obj = new Print();
        obj.setValue(1);
        System.out.println(obj.getPrintValue());
    }
}
