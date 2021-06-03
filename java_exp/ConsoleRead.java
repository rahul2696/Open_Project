// Java program to illustrate
// Console readLine() method

import java.io.*;

public class ConsoleRead {
	public static void main(String[] args)
	{
		
		Console cnsl
			= System.console();

		if (cnsl == null) {
			System.out.println(
				"No console available");
			return;
		}

		// Read line
		String str = cnsl.readLine(
			"Enter string : ");

		// Print
		System.out.println(
			"You entered : " + str);
	}
}
