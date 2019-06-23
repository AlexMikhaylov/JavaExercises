package BarkingDog;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 23.06.2019
 */
public class BarkingDog {
	/*
	 * @param boolean barking This is a boolean parameter, and it represents if the dog is currently barking
	 * @param int hourOfDay represents the hour of the day and has a valid range of 0-23
	 * @return true: We have to wake up if the dog is barking before 8 or after 22 hours. In other cases: false
	 */
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if((0 > hourOfDay) || (hourOfDay > 23)) {
			return false;
		}
		else if(barking && ((8 > hourOfDay) || 22 < hourOfDay)) {
			return true;
		}return false;
	}
}
