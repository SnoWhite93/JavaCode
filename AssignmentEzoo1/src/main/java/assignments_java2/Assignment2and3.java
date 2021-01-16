package assignments_java2;

public class Assignment2and3 {

    public static void main(String[] args) {
        String myString = printMessage(5);
        System.out.println(myString);
    }

    static String printMessage(int x) {
        if (x >= 3) {
            return x + " is greater than 3";
        } else {
            return x + " is not greater than 3";
        }
    }

}
