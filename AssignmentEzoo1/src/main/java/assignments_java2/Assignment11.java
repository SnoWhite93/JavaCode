package assignments_java2;

public class Assignment11 {

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myArr.length; i++) {
//            System.out.println(myArr[i]);
            for (int y = 1; y < 11; y++) {
                System.out.print(myArr[i] + "*" + y + ", ");
            }
        }
    }

}
