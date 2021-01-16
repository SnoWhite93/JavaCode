import java.lang.reflect.Array;

/**
 * 11.	Write a class named Assignment11 that 
 *  uses a double for-loop (a for-loop within a for-loop). 
 *  The outer loop should navigate through an integer array 
 *  that has 10 elements corresponding to the numbers 1 through 10, inclusive. 
 *  The inner loop should count from 1 to 10, and prints the value of the 
 *  current count multiplied by the current index of the array. 
 *  You should end up printing the multiples of 1 through 10 from 1 to 10. 
 *  Ex: 1*1, 1*2, 1*3…1*10, 2*1, 2*2, 2*3…10*9, 10*10.
 * @author Aron Anderson
 *
 */
public class Assignment11 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//setup my outer loop
		for (int i = 0; i < array1.length; i++){
			
			//start inner loop
			for (int j = 1; j <= 10; j++){
				int result = array1[i] * j;
				System.out.println("Result: " + result);
			}
		}
	}
}
