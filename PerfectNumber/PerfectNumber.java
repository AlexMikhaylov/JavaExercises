package PerfectNumber;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 31.07.2019
 */
public class PerfectNumber {
	/*
	 * The method calculates if the number is perfect.
	 *  If the number is perfect, the method returns true; otherwise, it returns false.
	 */
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}
		int sum = 0;
		for(int i = 1; i <= number / 2; i++) {
			if(number % i == 0) {
			sum += i;
			}
		}
		if(sum == number) {
			return true;
		}else
		return false;
	}
}
