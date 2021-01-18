package assignments_java9;

public class Application {

    public static void main(String[] args) {
        MyObject ob1 = new MyObject();
        MyObject ob2 = new MyObject();
        ob1.setId(1232132L);
        ob2.setId(1232132L);

        if (ob1.equals(ob2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
    }

}
