package assignments_java1;

public class Assignment6 {

    public static void main(String[] args) {
        double sum = addArrs(new double[]{10.5, 11.5});
        System.out.println(sum);
    }

     static double addArrs(double[] arr) {
        return arr[0] + arr[1];
     }
}
