package Interface_Examples;

public class Inter {

	public static void main(String[] args) {
		Lion lion =new Lion();
		Tiger tiger = new Tiger();
		lion.eat();
		lion.sleep();
		lion.run();
		System.out.println("---------------------------------------");
		tiger.eat();
		tiger.sleep();
		tiger.Chew();
		tiger.walk();
		tiger.run();
	}

}
interface Animal{
	void eat();
	void sleep();
	static void run() {
		System.out.println("It can run...");
	}
}
interface Carnivore{
	void Chew();
	void walk();
	default void run() {
		System.out.println("It also can run...");
	}
}
class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("Lion Eat is executed...");
		
	}

	@Override
	public void sleep() {
		System.out.println("Lion Sleep is executed...");
		
	}
	public void run() {
		System.out.println("Lion can run...");
	}
}
class Tiger implements Animal,Carnivore{

	@Override
	public void eat() {
		System.out.println("Tiger Eat is executed...");
		
	}

	@Override
	public void sleep() {
		System.out.println("Tiger Sleep is executed...");
	}

	@Override
	public void Chew() {
		System.out.println("Tiger Chew is Executed...");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger Walk is executed...");
		
	}
	public void run() {
	//System.out.println("Tiger can run...");
		//Animal.run();
		Carnivore.super.run();
	}
	
}
