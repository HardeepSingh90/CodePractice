/**
 * 
 */
package other;

/**
 * @author hardeesi
 *
 */
public class SquareRoot {
	private static final int INPUT = 5;

	/**
	 * @param valure
	 * @return
	 */
	private static double findSqrRoot(int num) {
		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;

			System.out.println("t = " + t + ", sqr = " + sqrtroot);
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = findSqrRoot(INPUT);
		System.out.println("Square Root of " + INPUT + " is = " + result);

	}

}
