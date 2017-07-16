package net.projecteuler;

/**
 * https://projecteuler.net/problem=7
 */
public class Solution {

	public static void main(String[] args) {
		final int targetPrimeNumber = 10_001;
		int primesCount = 1; // we start from 1 because 2 is prime
		long number = 1;
		while (primesCount != targetPrimeNumber) {
			number += 2;
			if (isPrime(number)) {
				primesCount++;
			}
		}
		System.out.println(number);
	}

	private static boolean isPrime(long number) {
		for (long i = 3; i < Math.sqrt(number) + 1; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
