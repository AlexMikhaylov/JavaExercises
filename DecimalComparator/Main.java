package DecimalComparator;
/*
* @author Alexander Mikhaylov
* @version 1.01
* @since 11.07.2019
*/
public class Main {
	
	/*
	 * This checks the method areEqualByThreeDecimalPlaces
	 * from the class DecimalCompilator
	 */
	public static void main(String[] args) {
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.176, 3.176));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1760, 3.176));

	}

}
