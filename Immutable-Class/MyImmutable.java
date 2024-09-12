import java.util.*;

public class MyImmutable {
    private final String name;
    private final List<Object> petNameList;

    MyImmutable(String name, List<Object> petNameList) {
        this.name = name;
        // Make a defensive copy of the list to maintain immutability
        this.petNameList = new ArrayList<>(petNameList);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public List<Object> getPetName() {
        // Return a new ArrayList to prevent modification of the original list
        return new ArrayList<>(petNameList);
    }
}
