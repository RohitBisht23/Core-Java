public enum Sample_Enum implements MyInterface{
    MONDAY ,
    TUESDAY,
    WEDNESDAY,
    FRIDAY,
    THURSDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
