package assignments_java2;

public class Assignment8 {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (isUd(i)) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 9);
    }

    static boolean isUd(int i) {
        return i % 2 != 0;
    }

}
