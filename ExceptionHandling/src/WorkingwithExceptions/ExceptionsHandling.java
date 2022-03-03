package WorkingwithExceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsHandling {

	public static void main(String[] args) throws IOException {
		Scanner toscan  = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int firstnumber = toscan.nextInt();
		int secondNumber = toscan.nextInt();
		new ExceptionsHandling().CalculateDivision(firstnumber, secondNumber);
	}
	void CalculateDivision(int firstnumber, int secondNumber) throws IOException{
		int result = firstnumber/secondNumber;
    if(result <= 2 ){
    	
        throw new IOException("Access Denied...");
    }
    else {
    	System.out.println("Access Granted... :)");
    }
}
	}
