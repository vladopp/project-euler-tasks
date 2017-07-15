package net.projecteuler;

/**
 * https://projecteuler.net/problem=5
 */
public class Solution {

	public static void main(String[] args) {
		final int max = 20;
		long answer = 1;
		for (int i = 2; i <= max; i++) {
			answer = lcm(answer, i);
		}
		System.out.println(answer);
	}

	private static long gcd(long a, long b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if (a > b) {
			return gcd(b, a % b);
		}
		return gcd(a, b % a);
	}

	private static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
