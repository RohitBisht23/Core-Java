public class Main {
    public static void main(String[] args) {
       /*
        * Common function which i used
        * 1-> values()
        * 2-> ordinal()
        * 3-> valueOf()
        * 4->name()
        */

       // Usage of values(), ordinal()
       for (SampleEnum sample : SampleEnum.values()) {
           System.out.println(sample.ordinal());
       }

       // usage of valueOf() and name()

       SampleEnum enumVariable = SampleEnum.valueOf("FRIDAY");
       System.out.println(enumVariable.name());
    }
}
