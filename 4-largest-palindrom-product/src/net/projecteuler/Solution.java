package net.projecteuler;

/**
 * https://projecteuler.net/problem=4
 */
public class Solution {

	public static void main(String[] args) {
		int biggestPalindrome = 0;
		for (int i = 999; i >= 900; i--) {
			for (int j = 999; j >= i; j--) {
				if (isPalindrome(String.valueOf(i * j)) && i * j > biggestPalindrome) {
					biggestPalindrome = i * j;
				}

			}
		}
		System.out.println(biggestPalindrome);
	}

	private static boolean isPalindrome(String input) {
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
				return false;
			}
		}
		return true;
	}
}
