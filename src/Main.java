import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		userName();	
		converter(totalMilesRan(dailyMilesRan()));
		
	}
	
	public static String userName() {
		System.out.println("What is your username?");
		
		Scanner username = new Scanner(System.in);
		String userName = username.nextLine();
		
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
	
	
	public static double totalMilesRan(double dailyMilesRan) {
		double totalMilesRan = 0;
		totalMilesRan += dailyMilesRan;
		return totalMilesRan;
	}
	
	
	public static double converter(double totalMilesRan) {
		
		Scanner kilos = new Scanner(System.in);
		
		double kilometers = totalMilesRan * 1.60934;
		
		System.out.println("Would you like to convert your total to kilometers?");		
			
		String answer = kilos.nextLine();
		
			if (answer == "Yes") {
				System.out.println("Your Kilometers ran is: " + kilometers);
			} else {
				System.out.println("Why is this the only answer it defaults to?");
			}
		
		
		return totalMilesRan;
	}	
}
