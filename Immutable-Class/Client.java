import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Object> petName = new ArrayList<>();
        petName.add("Dog");
        petName.add("Cat");

        MyImmutable obj = new MyImmutable("My name", petName);

        // Correct method name and adding elements to the returned list
        List<Object> petNameList = obj.getPetName();
        petNameList.add("Tiger");
        System.out.println(petNameList);
    }
}
