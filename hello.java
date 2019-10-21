// a simple program to practice common Github commands
import java.util.Scanner;


public class hello {

    public static void main(String [] args) {
	Scanner input = new Scanner(System.in);

        //String firstName = "Garret";
        //String lastName = "Dancik";
	
	System.out.print("Enter your first name: ");
    	String firstName = input.next();
	System.out.print("Enter your last name: ");
	String lastName = input.next();
  
	 

	
        System.out.println("Hello, my name is " + firstName+ " " + lastName);



    }
}

