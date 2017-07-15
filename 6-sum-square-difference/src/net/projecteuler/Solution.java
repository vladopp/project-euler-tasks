package net.projecteuler;

/**
 * https://projecteuler.net/problem=6
 */
public class Solution {

	public static void main(String[] args) {
		final int max = 100;

		long sumOfSquares = (2 * max + 1) * (max + 1) * max / 6;

		long sumThenSquare = max * (max + 1) / 2;
		sumThenSquare *= sumThenSquare;

		System.out.println(sumThenSquare - sumOfSquares);
	}

}
