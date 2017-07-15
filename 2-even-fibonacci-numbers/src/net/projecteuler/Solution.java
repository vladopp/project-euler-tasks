package net.projecteuler;

/**
 * https://projecteuler.net/problem=2
 */
public class Solution {

	public static void main(String[] args) {
		final int max = 4_000_000;
		long sum = 0L;

		int first = 1;
		int second = 1;

		while (first + second < max) {
			int next = first + second;
			if (next % 2 == 0) {
				sum += next;
			}
			first = second;
			second = next;
		}

		System.out.println(sum);
	}

}
