
package ConstructorsDemo;
public class WorkingWithThis {

	public static void main(String[] args) {
		
		WorkingWithThis ref = new WorkingWithThis();
		
		ref.met();
		
//		this.met();//Doesn't work here
		
		System.out.println("Back inside main..");//3

	}
	
	void met() {
		this.func();
//		func();//this.func();
		System.out.println("Inside met...");//2
	}
	
	void func() {
		System.out.println("Inside func...");//1
	}

}

//Inside every non-static method of a class
// there is a reference to the currently-executing-object(ceo)
// : this





