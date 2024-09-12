
public enum SampleEnumClass {
    MONDAY {
        public void dummyMethod() {
            System.out.println("This is the definition of abstract method for monday");
        }
    },

    TUESDAY {
        public void dummyMethod() {
            System.out.println("This is the definition of abstract method for truesday");
        }
    },

    WEDNESDAY {
        public void dummyMethod() {
            System.out.println("This is the definition of abstract method for wednesday");
        }
    },

    FRIDAY {
        public void dummyMethod() {
            System.out.println("This is the definition of abstract method for friday");
        }
    };

    public abstract void dummyMethod();
}
