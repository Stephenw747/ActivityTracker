import java.io.*;
import java.util.*;

public class User {
	
	public static void userName() {
		System.out.println("What is your username?");
		Scanner username = new Scanner(System.in);
		String userName = username.nextLine();
		System.out.println("Congrats " + userName);
	}
}
