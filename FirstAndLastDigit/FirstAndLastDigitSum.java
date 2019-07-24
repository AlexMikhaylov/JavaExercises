package FirstAndLastDigit;
/*
 * @author Alexander Mikhaylov
 * @since 24.07.2019
 * @version 1.0
 */

public class FirstAndLastDigitSum {
	/*
	 * The method finds the first and the last digit of the parameter number passed to the method and returns the sum of the first and the last digit of that number.

	 * If the number is negative then the method returns -1 to indicate an invalid value.
	 */
	 public static int sumFirstAndLastDigit(int number){
	        if(number < 0){
	            return -1;
	        }else{
	        int i = number;
	        int y;
	        do{
	        y = i % 10;
	        i /= 10;
	            
	        }while(i % 10 > 0);
	        return (number % 10) + y;
	            
	        }
	    }
}
