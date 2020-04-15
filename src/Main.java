import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int totalMiles = 0;
		
		String name = userName();
		totalMiles += dailyMilesRan();
		System.out.println("Your total miles ran is " + totalMiles + ", " + name);		
		converter(totalMiles);
	}
	
	
	
	
	
	
	
	
	
	public static String userName() {
		System.out.println("What is your Username?");
		Scanner console = new Scanner(System.in);

		String userName = console.nextLine();
		
		System.out.println("Hello " + userName);
		return userName;
	}
	
	
	
	public static double dailyMilesRan() {

		System.out.println("How many miles did you run?");
		
		Scanner milesran = new Scanner(System.in);
		double dailyMilesRan = milesran.nextDouble();	
		
		System.out.println("Congratulations on running " + dailyMilesRan + " miles!!");
		return dailyMilesRan;
	}	
		
	
	
	public static double converter(double totalMilesRan) {
		double kilometers = totalMilesRan * 1.60934;
		
		System.out.println("Would you like to convert your total to kilometers?");
		Scanner console = new Scanner(System.in);
		
		String answer = console.nextLine();
		
		if (answer == "Yes"){
				System.out.println("Your Kilometers ran is: " + kilometers);
			} else if (answer == "No") {
				System.out.println("Ok what would you like to do next?");
			} else {
				System.out.println("Please enter Yes or No:");
			}
			
		return kilometers;		
	}	
}
