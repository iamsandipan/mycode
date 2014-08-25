package com.interview.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrime {

	public static void main(String[] args) {
		GeneratePrime prime = new GeneratePrime();
		prime.generatePrime();
	}

	private final int MAX = 100;

	/*
	 * while x < N do Generate next x using the delta dx = 6 – dx; Test whether
	 * x is prime using all primes <= sqrt(x); If a prime is found, that is less
	 * than store it for later testing against bigger values; end
	 */
	public void generatePrime() {
		int x = 5;
		int dx = 4;

		List<Integer> primes = initPrimeTest();
		while (x < MAX) {
			boolean primeFound = false;
			primeFound = primeTest(primes, x, primeFound);
			if (primeFound) {
				primes.add(x);
			}
			x = computeNextNumber(dx, x);
		}
		for (int s : primes) {
			System.out.print(s + ",");
		}
	}

	private List<Integer> initPrimeTest() {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		return primes;
	}

	private boolean primeTest(List<Integer> primes, int x, boolean primeFound) {
		for (int prime : primes) {
			if (prime > Math.sqrt(x)) {
				break;
			}
			if (x % prime == 0) {
				primeFound = false;
				break;
			} else {
				primeFound = true;
				continue;
			}

		}
		return primeFound;
	}

	private int computeNextNumber(int dx, int x) {
		int delta = 6 - dx;
		x = x + delta;
		return x;
	}
}
