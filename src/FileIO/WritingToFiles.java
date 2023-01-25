package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingToFiles {

	/**
	 * This program for the example from slide deck #5
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		// setting up a scanner to read the log
		File file = new File("payments.txt");
		Scanner inputFile = new Scanner(file);
		
		// set up a print writer to write the new log
		PrintWriter writer = new PrintWriter("payments_totally_not_doctored.txt");
				
		int total = 0;
		
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			
			// get the dollar amount for summing
			String[] values = line.split(" ");
			String dollarAmount = values[0];
			int dollarAmountInt = Integer.valueOf(dollarAmount);
			total += dollarAmountInt;
			
			// for US or Canadian entries, print them to new file
			String country = values[2];
			if (country.equals("Canada") || country.equals("U.S.A")) {
				writer.println(line);
			}
		}
		
		inputFile.close();
		writer.close();

	}

}
