package net.projecteuler;

/**
 * https://projecteuler.net/problem=3
 */
public class Solution {

	public static void main(String[] args) {
		long number = 600_851_475_143L;
		long biggestPrimeFactor = 1;
		long secondBiggestPrimeFactor = 1;
		long currentDivisor = 3; // the number is not even so no need to divide by 2

		while (number != 1) {
			if (number % currentDivisor == 0) {
				number /= currentDivisor;
				secondBiggestPrimeFactor = biggestPrimeFactor;
				biggestPrimeFactor = currentDivisor;
			} else {
				currentDivisor += 2;
			}
		}

		if (isPrime(biggestPrimeFactor, secondBiggestPrimeFactor)) {
			System.out.println(biggestPrimeFactor);
		} else {
			System.out.println(secondBiggestPrimeFactor);
		}
	}

	private static boolean isPrime(long number, long startingDivisor) {
		for (long divisor = startingDivisor; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return true;
			}
		}
		return true;
	}

}
