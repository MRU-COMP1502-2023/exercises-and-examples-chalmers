package ClassBasics.caseStudy;

import java.util.Scanner;

public class Questions {

	private Scanner keyboard = new Scanner(System.in);
	
	private boolean askQuestion(String question) {
		System.out.println(question);
		String response = this.keyboard.nextLine();
		boolean boolResponse = response.equals("y");
		return boolResponse;
	}
	
	public boolean isHomeClaim() {
		return this.askQuestion("is this a home insurace claim? (y/n)");
	}
	
	public boolean isAutoClaim() {
		return this.askQuestion("is this an auto insurace claim? (y/n)");
	}
	
	public boolean claim3Months() {
		return this.askQuestion("was a claim made in the last 3 months? (y/n)");
	}
	
}
