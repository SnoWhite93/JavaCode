package assignments_java3;

public class Assignment7 {

    public static void main(String[] args) {

        String myString = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d ";
        int indexOfEquals = myString.indexOf("=");
        String x = myString.substring(indexOfEquals + 1, myString.length() - 1);
        System.out.println(x);
    }

}
