public enum SampleEnumClass {
    MONDAY(101, "This is first day of a week"),
    TUESDAY(102, "This is second day of a week"),
    WEDNESDAY(103, "This is third day of a week"),
    THUSDAY(104, "This is forth day of a week"),
    FRIDAY(105, "This is fifth day of a week"),
    SATURDAY(106, "This is sixth day of a week"),
    SUNDAY(107, "This is weekend day");

    private int val;
    private String comment;

    SampleEnumClass(int val, String str) {
        this.val = val;
        this.comment = str;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    //Class method
    public static SampleEnumClass getEnumFromValue(int value) {
        for(SampleEnumClass sample : SampleEnumClass.values()) {
            if(sample.val == value) {
                return sample;
            }
        }
        return null;
    }
}
