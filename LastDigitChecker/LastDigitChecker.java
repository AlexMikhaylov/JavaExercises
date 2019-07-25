package LastDigitChecker;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 25.07.2019
 */
public class LastDigitChecker {
	/*
	 * The method returns true if the number parameter is in range of 10(inclusive) - 1000(inclusive)
	 *  otherwise returns false.
	 */
	public static boolean isValid(int number) {
		if(number >= 10 && number <= 1000) {
			return true;
		}return false;
	}
	
	/*
	 * The method returns true if at least two of the numbers share the same rightmost digit;
	 *  otherwise, it returns false.
	 */
	public static boolean hasSameLastDigit(int a, int b, int c) {
		if(isValid(a) && isValid(b) && isValid(c)) {
			
			if((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10)) {
				return true;
			}else
			return false;
			
		}return false;
	}
}
