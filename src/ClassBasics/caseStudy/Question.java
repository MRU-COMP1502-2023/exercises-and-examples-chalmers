package ClassBasics.caseStudy;

import java.util.Scanner;

public class Question {

	private String questionText;
	private Scanner keyboard = new Scanner(System.in);

	public Question(String questionText) {
		this.questionText = questionText;
	}
	
	public boolean ask() {
		System.out.println(this.questionText);
		String response = this.keyboard.nextLine();
		boolean boolResponse = response.equals("y");
		return boolResponse;
	}
}
