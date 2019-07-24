package EvenDigitSum;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 24.07.2019
 */
public class EvenDigitSum {
	/*
	 * The method returns the sum of the even digits within the number
	 */
	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		int sum = 0;
		for(int i = number; number > 0; number /= 10) {
			if((number % 10) % 2 == 0) {
				sum += (number % 10);
			}
		}return sum;
	}
}
