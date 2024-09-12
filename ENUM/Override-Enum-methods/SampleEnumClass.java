public enum SampleEnumClass {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("This is dummy method of monday");
        }
    },

    TUESDAY,
    WEDNESDAY,
    FRIDAY,
    THURSDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod() {
        System.out.println("This is dummy method");
    }
}
