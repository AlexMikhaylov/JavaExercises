package MinutesToYearsAndDays;
/*
 * @author Alexander Mikhaylov
 * @since 17.07.2019
 * @version 1.00
 */
public class MinutesToYearsDaysCalculator {
	/*
	 * @return no
	 * @param amount of minutes
	 * This method calculates the years and days from the minute parameter
	 */
	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}else {
		
		int days = (int) ((minutes / 60) / 24);
		int years = days / 365;
		int remainingDays = (int) days % 365;
		
		System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
		}
	}
}
