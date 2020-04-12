import java.util.Scanner;

public class milesToKilometers extends Running {
	public static double converter(double totalMiles) {
		double milesConverted = totalMiles;
		double kilometers = milesConverted * 1.60934;
		Scanner kilos = new Scanner(System.in);
		
		System.out.println("Would you like to convert your total to kilometers?");		
	
		String Kilos = kilos.nextLine();
		
		if (Kilos == "Yes") {
			System.out.println("Your Kilometers ran is: " + Kilos);
		} else {
			System.out.println("Alright what would you like to do next?");
		}
		return kilometers;
	}
}