package NumberPalindrome;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 22.07.2019
 */
public class NumberPalindrome {
	/*
	 * This method checks if the parameter is a palindrome
	 * @return boolean true if the number is palindrome
	 */
	public static boolean isPalindrome(int number){
	     int reverse = 0;
	     int lastDigit = 0;
	     int numberLoop = number;
	     while(numberLoop != 0){
	         lastDigit = numberLoop % 10;
	         reverse = (reverse * 10) + lastDigit;
	         numberLoop /= 10;
	     }
	     return (number == reverse);
	 }
}
