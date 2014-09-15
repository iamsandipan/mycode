package com.interview.designpatterns.abstractfactory;

public class HashCodeTest {
	public static void f(){}
	public static void main(String [] args){
		int hashCode = HashCodeTest.hash("hello1".hashCode());
		System.out.println(indexFor(hashCode, 1000));
	}
	
	 static int hash(int h) {
	        // This function ensures that hashCodes that differ only by
	        // constant multiples at each bit position have a bounded
	        // number of collisions (approximately 8 at default load factor).
	        h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);
	 }
	 
	 static int   indexFor(int h, int length) {
		 return h & (length-1);
	 }
	 
}
class A extends HashCodeTest{
	
	public static void f(){}
}