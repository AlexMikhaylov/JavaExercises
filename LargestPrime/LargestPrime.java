package LargestPrime;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 4.08.2019
 */
public class LargestPrime {
	
	/*
	 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
	 * The method should calculate the largest prime factor of a given number and return it.
	 */
	public static int getLargestPrime(int number) {
		if(number < 2) {
			return -1;
		}else {
			
			for(int i = number; i >= 2; i--) {
				boolean prime = true;
				
				if(number % i == 0) {
					
					for(int j = 2; j <= Math.sqrt(i); j++) {
						if(i % j == 0) {
							prime = false;
							break;
						}
					}
					if(prime) {
						return i;
					}
				}
			}
		}return -1;
	}
}
