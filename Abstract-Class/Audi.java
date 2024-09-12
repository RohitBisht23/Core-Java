public class Audi extends LuxuryCar {
    Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void applyBreak() {
        System.out.println("Brake is applied. Car getting slow");
    }

    @Override
    public void pressDualBreak() {
        System.out.println("Dual brake system is pressed");
    }
}