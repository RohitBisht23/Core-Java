
public class client {
    public static void main(String[] args) {
        Car audiCarObj = new Car() {
            @Override
            public void applyBreak() {
                //Audi car implementation goes to here
                System.out.println("Break is applied");
            }
        };

        audiCarObj.applyBreak();
    }
}
