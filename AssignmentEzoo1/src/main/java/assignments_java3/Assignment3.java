package assignments_java3;

public class Assignment3 {

    public static void main(String[] args) {

        String x = "abc";
        String y = new String("abc");

        if (x == y) {
            System.out.println("they are equal");

        } else {
            System.out.println("They are not equal");
        }

        if (x.equals(y)) {
            System.out.println("are equal");
        } else {
            System.out.println("not equal");
        }
    }
}
