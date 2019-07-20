package SumOdd;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 20.07.2019
 */
public class SumOdd {
	
	/*
	 * @return boolean true if the number is odd
	 */
	public static boolean isOdd(int number) {
		if(number > 0) {
			if(number % 2 != 0) {
				return true;
			}
		}return false;
	}
	
	/*
	 * @param int start represents the start of a range
	 * @param int end represents the end of a range
	 * The method uses a for loop to sum all odd numbers in that range
	 * returning the sum
	 * This method calls isOdd() to check if each number is odd
	 */
	public static int sumOdd(int start, int end) {
		if((start <= end) && (start > 0) && (end > 0)) {
			int sum = 0;
			for(int i = start; i <= end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}return sum;
		}return -1;
	}
}
