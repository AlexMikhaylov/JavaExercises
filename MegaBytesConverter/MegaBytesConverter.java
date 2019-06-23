package MegaBytesConverter;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 23.06.2019
 */
public class MegaBytesConverter {
	/*
	 * This method calculates the megabytes and remaining
	 * kilobytes from the kilobytes parameter
	 * @param kiloBytes This is the kilobytes value in KB
	 * @megaBytes This is the calculated value in MB
	 * @remainingKiloBytes is the remaining KB value after the calculation
	 */
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes >= 0) {
			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +
					remainingKiloBytes + " KB");
		}else {
			System.out.println("Invalid Value");
		}
	}
}
