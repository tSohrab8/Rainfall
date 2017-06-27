import java.util.*;

public class Rainfall {

	public static void main(String[]args){
		
		Scanner keyboard = new Scanner(System.in);
		double width,length,rainfall;
		try{
			System.out.println("What is the width of the roof in inches?");
			width = keyboard.nextDouble();
		
			System.out.println("What is the length of the roof in inches?");
			length = keyboard.nextDouble();
		
			System.out.println("What is the rainfall in inches?");
			rainfall = keyboard.nextDouble();
		}
		catch(InputMismatchException e){
			System.err.println("You did not enter a number correctly. Please rerun the program and try again.");
			return;
		}
		
		double runOffInches = calculateRunOff(width,length,rainfall);
		
		double runOffGallons = runOffInches / 231;
		
		System.out.println("The total run off is " + runOffInches + " cubic inches \n= " + runOffGallons + " Gallons");
		
	}
	
	static double calculateRunOff(double width, double length, double rainfall){
		return width*length*rainfall;
	}
	
	
}
