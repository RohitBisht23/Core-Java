public class UpperBound<T extends Number> { //This shows to only give the subclass of Nnumbers
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    } 
}

/*
sub class on Number class is Integer, Float, Double etc
super class or Number of object
 */
