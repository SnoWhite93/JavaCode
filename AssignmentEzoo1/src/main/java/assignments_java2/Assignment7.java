package assignments_java2;

public class Assignment7 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (isIvan(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isIvan(int i) {
        return i%2==0;
    }

}

