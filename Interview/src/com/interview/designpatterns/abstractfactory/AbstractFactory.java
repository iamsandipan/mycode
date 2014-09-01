package com.interview.designpatterns.abstractfactory;

public class AbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Shape {

}

class Circle implements Shape{
	
}
class Triangle implements Shape{
	
}

interface Color {

}

class Red implements Color{
	
}
class Green implements Color{
	
}

class ShapeFactory extends AbsFactory{
	
	public Shape getShape(int identifier){
		if(identifier == 0){
			return new Circle();
		}else{
			return new Triangle();
		}
		
	}

	@Override
	Color getColor(int identifier) {
		// TODO Auto-generated method stub
		return null;
	}
}
class ColorFactory extends AbsFactory{
	
	public Color getColor(int identifier){
		if(identifier == 0){
			return new Red();
		}else{
			return new Green();
		}
		
	}

	@Override
	Shape getShape(int identifier) {
		// TODO Auto-generated method stub
		return null;
	}
}


abstract class AbsFactory{
	abstract Color getColor(int identifier);
	
	abstract Shape getShape(int identifier);
}


class FactoryProducer {

	public AbsFactory getFactory(int identifier){
		if(identifier == 0){
			return new ColorFactory();
		}else{
			return new ShapeFactory();
		}
		
	}
	
}




