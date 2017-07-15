package net.projecteuler;

import java.util.HashSet;
import java.util.Set;

/**
 * https://projecteuler.net/problem=1
 */
public class Solution {

	public static void main(String[] args) {
		final int max = 1000;
		long sum = 0L;
		Set<Integer> numbers = new HashSet<>();

		for (int i = 3; i < max; i += 3) {
			numbers.add(i);
		}
		
		for (int i = 5; i < max; i += 5) {
			numbers.add(i);
		}
		
		sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
