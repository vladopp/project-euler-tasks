package net.projecteuler;

/**
 * https://projecteuler.net/problem=3
 */
public class Solution {

	public static void main(String[] args) {
		long number = 600_851_475_143L;
		long currentDivisor = 3; // the number is not even so no need to divide by 2

		while (number != 1) {
			if (number % currentDivisor == 0) {
				number /= currentDivisor;
			} else {
				currentDivisor += 2;
			}
		}
		
		System.out.println(currentDivisor);
	}
}
