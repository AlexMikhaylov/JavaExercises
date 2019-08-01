package NumberToWords;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 01.08.2019
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * testing all three methods 
		 */
		System.out.println(NumberToWords.getDigitCount(123));
		System.out.println(NumberToWords.getDigitCount(1010));
		System.out.println(NumberToWords.getDigitCount(0));
		System.out.println(NumberToWords.getDigitCount(-12));
		
		System.out.println(NumberToWords.reverse(123));
		System.out.println(NumberToWords.reverse(1010));
		System.out.println(NumberToWords.reverse(0));
		System.out.println(NumberToWords.reverse(-12));
		
		NumberToWords.numberToWords(123);
		NumberToWords.numberToWords(1010);
		NumberToWords.numberToWords(0);
		NumberToWords.numberToWords(-12);

	}

}
