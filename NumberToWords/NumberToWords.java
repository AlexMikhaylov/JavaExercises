package NumberToWords;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 01.08.2019
 */
public class NumberToWords {
	
	/*
	 * @return int the count of the digits in the number
	 */
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		int count = 1;
		for(int i = 1; number != 0; number /= 10) {
			count = i;
			i++;
		}
		return count;
	}
	
	/*
	 * The method reverse should have one int parameter and return the reversed number (int). For example,
	 * if the number passed is 234, then the reversed number would be 432.
	 * The method  reverse should also reverse negative numbers.
	 */
	public static int reverse(int number) {
		int reverse = 0;
		for(int i = number; number != 0; i++, number /= 10) {
			reverse = (reverse * 10) + number % 10;
		}
		return reverse;
	}
	
	/*
	 * The method prints the number as words
	 */
	public static void numberToWords(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		}else {
			int reversed = reverse(number);
			do {  
				switch(reversed % 10) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				}
				reversed /= 10;
			} while(reversed != 0);
			
			for(int i = (getDigitCount(number) - getDigitCount(reverse(number))); i > 0; i--) {
				System.out.println("Zero");
			}
		}
	}
}
