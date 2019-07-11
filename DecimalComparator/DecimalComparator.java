package DecimalComparator;
/*
* @author Alexander Mikhaylov
* @version 1.01
* @since 11.07.2019
*/
public class DecimalComparator {

	/*
	 * @return boolean true if two doubles are the same up to three decimal places
	 * Otherwise it returns false
	 */
	public static boolean areEqualByThreeDecimalPlaces(double par1, double par2) {
		
		int par1Int = (int) (par1 * 1000);
		int par2Int = (int) (par2 * 1000);
		if(par1Int == par2Int) {
			return true;
		}return false;
	}
}
