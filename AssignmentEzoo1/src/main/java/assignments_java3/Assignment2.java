package assignments_java3;

public class Assignment2 {

    public static void main(String[] args) {
        System.out.println(isEqualSign("abc", "ABC"));
        boolean equal = isEqual("abc", "ABC");
        System.out.println(equal);

    }

    static boolean isEqualSign(String x, String y) {
        if (x == y) {
            System.out.println("Strings are equal");
            return true;
        }
        return false;
    }

    static boolean isEqual (String x, String y) {
        if (x.equals(y)) {
            System.out.println("strings are Equal");
            return true;
        }
        return false;
    }

}
