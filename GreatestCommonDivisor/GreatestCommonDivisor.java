package GreatestCommonDivisor;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 25.07.2019
 */
public class GreatestCommonDivisor {
	
	/*
	 * The method returns the greatest common divisor of the two numbers (int)
	 * in the range >= 10
	 */
	public static int getGreatestCommonDivisor(int first, int second) {
		if(first >= 10 && second >= 10) {
			
			int divisor = 0;
			for(int i = 1; i <= first || i <= second; i++) {
				if(first % i == 0 && second % i == 0 && i > divisor) {
					divisor = i;
				}				
			}return divisor;
		}return -1;
	}
}
