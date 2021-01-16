package assignments_java2;

public class Assignment6 {

    public static void main(String[] args) {
        String myMessage = printMessage(23.56f);
        System.out.println(myMessage);
    }

    static String printMessage(float x) {
        if (x == 3) {
            return x + " is equal to 3";
        } else if (x > 5){
            return x + " is greater than 5";
        } else if (x <= 0){
            return x + " is less than or equal to 0";
        } else{
            return x + " is none of the other options";
        }
    }

}
