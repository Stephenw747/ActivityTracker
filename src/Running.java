import java.io.*;
import java.util.*;

public class Running {

		public static double milesRan() {
			double totalMiles = 0;
			
			System.out.println("How many miles did you run?");
			
			Scanner milesran = new Scanner(System.in);
			double milesRan = milesran.nextDouble();
			totalMiles += milesRan;	
			
			System.out.println("Your new total miles is: " + totalMiles);
			return totalMiles;
		}
}
