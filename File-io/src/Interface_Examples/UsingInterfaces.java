package Interface_Examples;

public class UsingInterfaces {

	public static void main(String[] args) {
		
//		Chinnapa chinnapa = new Chinnapa();
//		chinnapa.eat();
//		chinnapa.sleep();
//		
//		Bhagyashri bhagya = new Bhagyashri();
//		bhagya.breathe();
//		bhagya.workForWages();
//		
//		bhagya.read();//Works
		
		
//		Human ref = new Chinnapa();//IS-A
//		
//		ref.eat();
//		ref.sleep();
//		ref.breathe();
////		ref.sing();//Doesn't work
//		
//		System.out.println("------------------------");
//		
//		ref = new Bhagyashri();//IS-A
//		
//		ref.eat();
//		ref.sleep();
//		ref.breathe();
		
		
		Human []ref = new Human[3];//We can do this!!!
		
		ref[0] = new Chinnapa();
		ref[1] = new Bhagyashri();
		ref[2] = new Chinnapa();
		
		for(Human r : ref) {
			r.eat();
			r.read();
			if(r instanceof Chinnapa)
				((Chinnapa)r).sing();//Reference Variable Casting
		}	
		
	}

}

//Note: A super type reference variable can refer to an 
// object of the sub class but can only call those methods
// of the sub class which are first declared in the super type

interface Human{
	void eat();
	void sleep();
	void breathe();
	
	//void read();//This method was created later on, with serious repurcussions
	
	default void read() {//Starting with Java 8
		System.out.println("Humans can read as well now");
	}
	
}
interface Employee{
	void workForWages();
	void sleep();
	
	default void read() {
		System.out.println("Employee's read...");
	}
}

class Chinnapa implements Human{
	@Override
	public void eat() {
		System.out.println("Chinnapa's eat...");
	}
	@Override
	public void sleep() {
		System.out.println("Chinnapa's sleep");
		
	}
	@Override
	public void breathe() {
		System.out.println("Chinnapa's breathe");
		
	}
	
	void sing() {
		System.out.println("Chinnapa can sing really well...");
	}
}

class Bhagyashri implements Human, Employee{
	@Override
	public void eat() {
		System.out.println("Bhagyashri's eat");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("Bhagyashri's sleep");
		
	}
	
	@Override
	public void breathe() {
		System.out.println("Bhagyashri's breathe...");
		
	}
	
	@Override
	public void workForWages() {
		System.out.println("Bhagyashri works now...");
		
		
	}

	@Override
	public void read() {
//		System.out.println("Bhagya's reaad...");
		Employee.super.read();//Solving the diamond problem
	}
}











