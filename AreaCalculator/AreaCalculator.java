package AreaCalculator;
/*
 * @author Alexander Mikhayov
 * @version 1.0
 * @since 23.06.2019
 */
public class AreaCalculator {
	
	private static final double INVALID_VALUE_MESSAGE = -1d; 
	
	/*
	 * @return double This returns the area of a circle
	 */
	public static double area(double radius) {
		if(radius < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		return radius * radius * Math.PI;
	}
	
	/*
	 * @return double represents the area of a rectangle
	 */
	public static double area(double x, double y) {
		if(x < 0 || y < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		return x*y;
	}
}
