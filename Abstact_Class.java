package sample.com;

abstract class Shape{
	//abstract method no need to defined
	abstract void area();
}

class Square extends Shape{
	@Override
	void area() {
		System.out.println("The Shape is Square");
	}
}

class Triangle extends Shape{
	@Override
	void area() {
		System.out.println("The Shape is Triangle");
	}
}

public class Abstact_Class {
	
	public static void main(String[] args) {
		
		//no need to create object for abstract class but need to create object for child class
//		Square s = new Square();
//		s.area();
//		Triangle t = new Triangle();
//		t.area();
		
//		another way to assign as array
		
		
		Shape[] s = new Shape[6];
		s[0] = new Square();
		s[1] = new Square();
		s[2] = new Square();
		s[3] = new Triangle();
		s[4] = new Triangle();
		s[5] = new Triangle();
		
		for(Shape s1:s) {
			s1.area();
		}
	}

}
