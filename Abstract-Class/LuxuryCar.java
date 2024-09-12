public abstract class LuxuryCar extends Car {

    LuxuryCar(int mileage) {
        super(mileage);
    }

    // Apply more abstraction
    public abstract void pressDualBreak();

    @Override
    public void pressClutch() {
        System.out.println("Clutch is pressed. Speed getting increase");
    }
}