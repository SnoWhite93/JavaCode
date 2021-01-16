package assignments_java2;

public class Assignment4and5 {

    public static void main(String[] args) {
        String myString = printMessage(3);
        System.out.println(myString);
    }

    static String printMessage(int x) {
        if (x == 3) {
            return x + " is equal to 3";
        } else {
            return x + " is not equal to 3";
        }
    }

}
