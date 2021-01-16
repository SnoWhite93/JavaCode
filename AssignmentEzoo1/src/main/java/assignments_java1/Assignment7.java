package assignments_java1;

public class Assignment7 {


    public static void main(String[] args) {

        double res = addArrs(new int []{11,22,33});
        System.out.println(res);
    }

    static int addArrs(int[] arr) {
        return arr[0] - arr[1] + arr[2];
    }

}
