package DiagonalStar;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 4.08.2019
 */
public class DiagonalStar {
	/*
	 * Write a method named printSquareStar with one parameter of type int named number.
	 * If number is < 5, the method should print "Invalid Value".
	 * The method should print diagonals to generate a rectangular pattern composed of stars (*).
	 * This should be accomplished by using loops
	 */
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println("Invalid Value");
		}else {
			
			for(int colums = 1; colums <= number; colums++) {
				
				for(int raw = 1; raw <= number; raw++) {
					if((raw == 1) || (raw == number) || (colums == 1) || (colums == number) || (raw == colums) || (colums == number - raw + 1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
