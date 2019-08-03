package FlourPackProblem;
/*
 * @author Alexander Mikhayov
 * @version 1.0
 * @since 02.08.2019
 */
public class Main {
	/*
	 * Testing the method canPack()
	 */
	public static void main(String[] args) {
		System.out.println(FlourPackProblem.canPack(0, 0, 0));
		System.out.println(FlourPackProblem.canPack(1, 0, 4));
		System.out.println(FlourPackProblem.canPack(1, 0, 5));
		System.out.println(FlourPackProblem.canPack(0, 5, 4));
		System.out.println(FlourPackProblem.canPack(2, 2, 11));
		System.out.println(FlourPackProblem.canPack(-3, 2, 12));

	}

}
