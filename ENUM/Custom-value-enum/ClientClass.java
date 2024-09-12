
public class ClientClass {
    public static void main(String[] args) {
        SampleEnumClass obj = new SampleEnumClass(109, "Hello");

        System.out.println(obj.getComment());

        //Below function getEnumFromValue() is static function so we do not need object we can call it with class name
        SampleEnumClass sample = SampleEnumClass.getEnumFromValue(107);
        System.out.println(sample.getComment());
    }
}
