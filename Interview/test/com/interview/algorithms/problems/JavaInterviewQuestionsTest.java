package com.interview.algorithms.problems;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JavaInterviewQuestionsTest {
	JavaInterviewQuestions interviewtest;

	@Before
	public void setUp(){
		interviewtest = new JavaInterviewQuestions();
	}

	@Test
	public void testLongestPalindrome1() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPalindrome() {
		fail("Not yet implemented");
	}

	@Test
	public void testMatrixSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindRow() {
		fail("Not yet implemented");
	}

	@Test
	public void testBinarySearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveDuplicatesFromSortedArray() {
		int[] array = {1,1,2,2,3};
		interviewtest.removeDuplicatesFromSortedArray(array );
	}
	
	@Test
	public void testRemoveDuplicatesFromUnSortedArray(){
		int[] array = {1,2,1,2,2,3};
		interviewtest.removeDuplicatesFromUnSortedArray(array );
	}
	
	@Test
	public void testCreateAllPossibleSubString(){
		
		List<String> strings = interviewtest.createSubStrings("abc");
		assertTrue(strings.contains("ab"));
		
	}

	@Test
	public void testFindMinSumInGraph(){
			int [][] twoDiamArray = {
										     {2},
										    {3,4},
										   {6,5,7},
										  {4,1,8,3}
										};
			interviewtest.findMinSumInGraph(twoDiamArray);
	}
	
	@Test
	public void testFindLongestSubstring(){
		int length = interviewtest.findLongestSubstring("abcdeacdefgt");
		System.out.println(length);
	}
	@Test
	public void testFindSumN(){
		int [] array = {-1 ,0, 1, 2, -1, -4};
		List<Integer[]> length = interviewtest.findSumN(array, 0);
		System.out.println(length);
	}
}
