package assignments_java1;

public class Assignment10  {

    public static void main(String[] args) {
        String myStrings = fifthElem(new String[]{"flag", "polish", "roses", "knife", "gun"});
        System.out.println(myStrings);
    }

    static String fifthElem(String[] myarr) {
        return myarr[4];
    }
}
