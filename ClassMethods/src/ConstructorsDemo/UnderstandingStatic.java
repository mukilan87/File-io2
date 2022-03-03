package ConstructorsDemo;

public class UnderstandingStatic {
	
	static int var;
	
	int other;
	
	static void func() {
		System.out.println("Inside func...");
	}

	public static void main(String[] args) {
		
		UnderstandingStatic firstRef = new UnderstandingStatic();
		
		UnderstandingStatic secondRef = new UnderstandingStatic();
		
		firstRef.var = 987;//UnderstandingStatic.var = 987;
		
		System.out.println(secondRef.var);//UnderstandingStatic.var
		
		secondRef.var = 100;
		
		System.out.println(firstRef.var);
		
		firstRef.other = 98;
		
		System.out.println(secondRef.other);
		
//		static float f;//Error, static not allowed here
		
		UnderstandingStatic.var = 90;//Accessed with the class name
		
		System.out.println(UnderstandingStatic.var);
		
//		UnderstandingStatic.func();
//		func();
		
		new UnderstandingStatic().func();//UnderstandingStatic.func();
		
	}

}


//static members of a class are loaded into memory at the time
// the class is loaded, i.e even before any objects of the class
// are created
