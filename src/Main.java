import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		userName();
		milesRan();		
		converter();		
	}
	
	public static void userName() {
		System.out.println("What is your username?");
		
		Scanner username = new Scanner(System.in);
		String userName = username.nextLine();
		
		System.out.println("Congrats " + userName);
	}
	
	
	
	public static double milesRan() {
		double totalMiles = 0;
		
		System.out.println("How many miles did you run?");
		
		Scanner milesran = new Scanner(System.in);
		double milesRan = milesran.nextDouble();
		totalMiles += milesRan;	
		
		System.out.println("Your new total miles is: " + totalMiles);
		return totalMiles;
	}
	
	
	
	public static double converter(double totalMiles) {
		double miles = totalMiles;
		double kilometers = miles * 1.60934;
		
		System.out.println("Would you like to convert your total to kilometers?");		
		
		
		Scanner kilos = new Scanner(System.in);		
		String answer = kilos.nextLine();
		
		if (answer == "Yes") {
			System.out.println("Your Kilometers ran is: " + kilometers);
		} else {
			System.out.println("Alright what would you like to do next?");
		}
		return miles;
	}

	
	
	
}
