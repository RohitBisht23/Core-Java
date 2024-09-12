public class Main {
    public static void main(String[] args) {
        PrintColor printColorObj = new PrintColor("red", 1213);
        String color = printColorObj.keyMethod();
        System.out.println(color);

        printColorObj.printColor("blue");
    }
}
