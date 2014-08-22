package com.interview.algorithms;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareRootTest {
	SquareRoot sqrt ;
	
	@Before
	public void setUp(){
		sqrt = new SquareRoot();
	}
	
	@Test
	public void test() {
		System.out.println(sqrt.sqrt(9));
		System.out.println(sqrt.sqrt(16));
		System.out.println(sqrt.sqrt(25));
		System.out.println(sqrt.sqrt(36));
		System.out.println(sqrt.sqrt(49));
		System.out.println(sqrt.sqrt(0.4));
		System.out.println(sqrt.sqrt(0.16));
	}

}
