package SharedDigit;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 25.07.2019
 */
public class SharedDigit {
	
	/*
	 * The method returns true if there is a digit that appears in both numbers,
	 *  such as 2 in 12 and 23; otherwise, the method returns false.
	 */
	  public static boolean hasSharedDigit(int number1, int number2){
	        if((number1 > 9) && (number2 > 9) && (number1 < 100) && (number2 < 100)) {
	            for (int i; number1 > 0; number1 /= 10) {
	                i = number1 % 10;

	                if (i == number2 % 10 || i == number2 / 10) {
	                    return true;
	                }
	            }
	            return false;
	        }return false;
	    }
	}