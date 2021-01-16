package assignments_java2;

public class Assignment1 {

    public static void main(String[] args) {
        boolean whatItIs = checkIfEven(12);
        System.out.println(whatItIs);
    }

    static boolean checkIfEven(int x) {
        return x % 2 == 0;
    }

}
