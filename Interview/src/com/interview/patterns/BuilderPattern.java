package com.interview.patterns;

public class BuilderPattern {
		public  static void main(String [] args){
			Builder builder = new Builder().buildAge("10").buildName("abc");
			ProductInterface it = builder.build();
			System.out.println(it);
			
		}
}



class Builder {
	
	private ProductInterface absProduct = new Product();
	
	
	
	public Builder buildName(String name ){
		absProduct.setName(name);
		return this;
	}
	
	public Builder buildAge(String age){
		absProduct.setAge(age);
		return this;
	}
	
	public ProductInterface build(){
		return absProduct;
	}
	
}

interface ProductInterface{
	 String getName() ;
	 void setName(String name);
	 String getAge() ;
	 void setAge(String age) ;
}

class Product implements ProductInterface{
	
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString(){
		return "Name is " + name + " Age : " + age;
		
	}
	
}