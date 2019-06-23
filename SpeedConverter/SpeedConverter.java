package SpeedConverter;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 23.06.2019
 */
public class SpeedConverter {
	
	/*
	 * @param double This is kilometers per hour
	 * @return long the converted value of kilometers to miles per hour
	 */
	public static long toMilesPerHour(double kilometersPerHour) {
		long milesPerHour = -1;
		if(kilometersPerHour >= 0) {
			return milesPerHour = Math.round(kilometersPerHour / 1.609);
		}else {
			return milesPerHour;
		}
	}
	
	/*
	 * @param double Kilometers per Hour
	 * Printing the result of the method toMilesPerHour
	 */
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour >= 0) {
			System.out.println(kilometersPerHour + " km/h = " +
					toMilesPerHour(kilometersPerHour) + " mi/h");
		}else {
			System.out.println("Invalid Value");
		}
	}
}
