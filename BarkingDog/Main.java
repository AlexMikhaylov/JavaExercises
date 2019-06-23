package BarkingDog;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 23.06.2019
 */
public class Main {
	/*
	 * The main method for testing of BarkingDog
	 */
	public static void main(String[] args) {
		System.out.println(BarkingDog.shouldWakeUp(true, 1));
		System.out.println(BarkingDog.shouldWakeUp(false, 2));
		System.out.println(BarkingDog.shouldWakeUp(true, 8));
		System.out.println(BarkingDog.shouldWakeUp(true, -1));
		System.out.println(BarkingDog.shouldWakeUp(true, 23));

	}

}
