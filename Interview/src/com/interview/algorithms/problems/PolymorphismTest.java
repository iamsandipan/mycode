package com.interview.algorithms.problems;

public class PolymorphismTest {

	public static void main(String [] args){
		BaseClass b1 = new BaseClass();
		BaseClass b = new ChildClass();
		ChildClass c = new ChildClass();
		b.get();
		System.out.println(b.i);
		b1.get();
		System.out.println(b1.i);
		c.get();
		System.out.println(c.i);
	}
}


class BaseClass{
	public int i = 8;
	public void get(){
		System.out.println("Hello from Base");
	}
}

class ChildClass extends BaseClass{
	
	public int i = 10;
	
	public void get(){
		System.out.println("Hello  from ChildClass");
	}
	
}