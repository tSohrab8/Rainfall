import java.util.*;

public class Rainfall {

	public static void main(String[]args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the width of the roof in inches?");
		double width = keyboard.nextDouble();
		
		System.out.println("What is the length of the roof in inches?");
		double length = keyboard.nextDouble();
		
		System.out.println("What is the rainfall in inches?");
		double rainfall = keyboard.nextDouble();
		
		double runOffInches = calculateRunOff(width,length,rainfall);
		
		double runOffGallons = runOffInches / 231;
		
		System.out.println("The total run off is " + runOffInches + " cubic inches \n= " + runOffGallons + " Gallons");
		
	}
	
	static double calculateRunOff(double width, double length, double rainfall){
		return width*length*rainfall;
	}
	
	
}
