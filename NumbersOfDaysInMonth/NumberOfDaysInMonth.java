package NumbersOfDaysInMonth;
/*
 * @author Alexander Mikhaylov
 * @since 19.07.2019
 * @version 19.07.2019
 */
public class NumberOfDaysInMonth {
	/*
	 * This method checks if the int is a leap year
	 */
	
	public static boolean isLeapYear(int year) {
		while(year >= 1 && year <= 9999) {
			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) {
				return true;
			}return false;
		}return false;
	}
	
	/*
	 * This method returns the number of days in the month
	 * @return int number of days
	 */
	public static int getDaysInMonth(int month, int year) {
		if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
			return -1;
		}
		
		switch(month) {
		case 1:
			return 31;
		case 2:
			if(isLeapYear(year)) {
				return 29;
			}else{return 28;}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return -1;
		}
	}
}
