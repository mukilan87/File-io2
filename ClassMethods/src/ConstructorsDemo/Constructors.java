package ConstructorsDemo;

public class Constructors {

	public static void main(String[] args) {
		Constructors ref = new Constructors();
		ref.met();
	}

	void met() {
		func(); // Inside every non static method of a class there is a 
		System.out.println("hi");
	}

	private void func() {
		System.out.println("Hello");
		
	}
}
