package assignments_java3;

public class Assignment5 {

    public static void main(String[] args) {

        String message = "Hello My Name is Java";
        int fristSpace = message.indexOf(" ");
        int secondSpace = message.indexOf(" ", fristSpace + 1);
        System.out.println(secondSpace);
    }
}
