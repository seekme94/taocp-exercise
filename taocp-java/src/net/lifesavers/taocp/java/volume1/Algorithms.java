/**
 * 
 */
package net.lifesavers.taocp.java.volume1;

/**
 * @author Owaishussain@outlook.com
 *
 */
public class Algorithms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(greatestCommonDivisor(8, 12));
		swapFourVariables(4, 6, 8, 9);
		System.out.println(greatestCommonDivisorWithoutReplacement(8, 12));
		System.out.println(greatestCommonDivisor(2166, 6099)); // Exercise 4 in 1.1
	}

	/**
	 * Example in 1.1
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static double greatestCommonDivisor(double m, double n) {
		// Swap the values if m is less than n to reduce complexity
		double r = 1;
		if (m < n) {
			double tmp = m;
			m = n;
			n = tmp;
		}
		while (r > 0) {
			r = m % n;
			if (r == 0) {
				return n;
			}
			n = r;
		}
		return n;
	}

	/**
	 * Exercise 1 in 1.1
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public static void swapFourVariables(int a, int b, int c, int d) {
		int tmp = a;
		a = b;
		b = c;
		c = d;
		d = tmp;
		System.out.printf("%d %d %d %d\n", a, b, c, d);
		// A better way would be int[] arr = {a, b, c, d}; then arr = new int[]
		// {arr[1], arr[2], arr[3], arr[0]};
	}
	
	/**
	 * Exercise 3 in 1.1
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static double greatestCommonDivisorWithoutReplacement(double m, double n) {
		// Swap the values if m is less than n to reduce complexity
		double r = 1;
		if (m < n) {
			double tmp = m;
			m = n;
			n = tmp;
		}
		while (m % n > 0) {
			n = m % n;
		}
		return n;
	}
}
