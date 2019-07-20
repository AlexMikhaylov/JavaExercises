package SumOdd;
/*
 * @author Alexander Mikhaylov
 * @version 1.0
 * @since 20.07.2019
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * testing the method isOdd()
		 */
		System.out.println(SumOdd.isOdd(-1));
		System.out.println(SumOdd.isOdd(0));
		System.out.println(SumOdd.isOdd(1));
		System.out.println(SumOdd.isOdd(2));
		System.out.println(SumOdd.isOdd(3));
		System.out.println(SumOdd.isOdd(4));
		
		/*
		 * testing the method sumOdd()
		 */
		System.out.println(SumOdd.sumOdd(1, 100));
		System.out.println(SumOdd.sumOdd(-1, 100));
		System.out.println(SumOdd.sumOdd(100, 100));
		System.out.println(SumOdd.sumOdd(13, 13));
		System.out.println(SumOdd.sumOdd(100, -100));
		System.out.println(SumOdd.sumOdd(100, 1000));

	}

}
