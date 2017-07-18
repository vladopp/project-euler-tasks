package net.projecteuler;

/**
 * https://projecteuler.net/problem=9
 */
public class Solution {

	public static void main(String[] args) {
		final int sum = 1000;

		outer:
		for (int c = 334; c < sum; c++) {
			for (int a = 1; a < (sum - c) / 2; a++) {
				int b = sum - a - c;
				if (a * a + b * b == c * c) {
					System.out.println(a * b * c);
					break outer;
				}
			}
		}
	}

}
