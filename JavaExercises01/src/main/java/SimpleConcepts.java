public class SimpleConcepts {

    public static void main(String[] args) {
// print variable, if i write it under sout it won't recognize it
        int myInt = 77;
        System.out.println("My int is " + myInt);

// while loop
     int value = 0;

     while(value < 10) {
         System.out.println("Hello " + value);
         value = value + 1;
     }

     int value2 = 3;

     while(value2 < 15) {
         System.out.println(" value is now " + value2);
        value2++;
     }
     int x = 3;
     while( x < 7) {
         System.out.println(" x is now " + x);
         x++;
     }

// for loops, \n prints new line, %d special character get replaced by the var specified


for(int i = 0; i < 5; i++) {
    System.out.printf("\nHello all : %d\n ", i);
}
// if condition
  int myInt2 = 20;
      if(myInt2 < 10) {
          System.out.println("true");
      } else {
          System.out.println("not true");

      }


    }
}
