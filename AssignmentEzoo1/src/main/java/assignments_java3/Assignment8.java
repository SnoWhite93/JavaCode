package assignments_java3;

public class Assignment8 {

    public static void main(String[] args) {
        String givenWord = "race";
        String anagram = "care";

//        for(char g : givenWord.toCharArray()) {
//            System.out.println(g);
//
//            if(anagram.indexOf("c")==givenWord.indexOf("r"))
//        }

        for(char a : givenWord.toCharArray()) {
            if(anagram.indexOf(a) != -1) {
                System.out.println(a + " exists");
            }
        }
    }
}
