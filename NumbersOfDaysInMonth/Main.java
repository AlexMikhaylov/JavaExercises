package NumbersOfDaysInMonth;

public class Main {

	public static void main(String[] args) {
		/*
		 * testing the method checkiing a leap year
		 */
		System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
		System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
		System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
		System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
		
		/*
		 * testing the method getDaysInMonth()
		 */
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
		System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
		
	}

}
