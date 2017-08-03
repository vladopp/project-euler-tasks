package net.projecteuler;

/**
 * https://projecteuler.net/problem=10
 */
public class Solution {

	private static final int MAX = 2_000_001;
	private static boolean[] primes = new boolean[MAX];

	public static void main(String[] args) {
		sieve();
		long sum = 0;
		for (int i = 0; i < MAX; i++) {
			if (!primes[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private static void sieve() {
		primes[0] = true;
		primes[1] = true;

		for (int i = 2; i < Math.sqrt(MAX) + 1; i++) {
			if (!primes[i]) {
				for (int j = i * i; j < MAX; j += i) {
					primes[j] = true;
				}
			}
		}
	}
}
