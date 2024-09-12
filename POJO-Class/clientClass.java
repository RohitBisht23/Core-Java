
public class clientClass {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setID(1);
        st1.setName("Rohit");
        st1.setAddress("Delhi");

        System.out.println(st1.getAddress());
        System.out.println(st1.getId());
        System.out.println(st1.getName());
    }
}
