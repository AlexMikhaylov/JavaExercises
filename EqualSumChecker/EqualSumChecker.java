package EqualSumChecker;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 11.07.2019
 */
public class EqualSumChecker {
	
	/*
	 * @return double This returns true if the sum of the first
	 * and second parameter is equal to the third parameter.
	 * Otherwise, return false
	 */
	public static boolean hasEqualSum(int number1, int number2, int number3) {
		if((number1 + number2) == number3) {
			return true;
		}return false;
	}
}
