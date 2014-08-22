package com.interview.algorithms;

import org.junit.Before;
import org.junit.Test;

public class SmallestDivisorTest {
	private SmallestDivisor smallestDivisor;
	
	@Before
	public void setUp(){
		smallestDivisor = new SmallestDivisor();
	}
	@Test
	public void testGetDivisor() {
		System.out.println(smallestDivisor.getDivisor(49));
	}

}
