package ClassBasics.caseStudy;
import ClassBasics.caseStudy.*;

public class main2 {

	public static void main(String[] args) {
		
		Question homeQuestion = new Question("is this a home claim? (y/n)");
		Question autoQuestion = new Question("is this a auto claim? (y/n)");
		Question threeMonthQuestion = new Question("was a claim made in the last 3 months? (y/n)");
		
		boolean homeClaim = homeQuestion.ask();
		boolean autoClaim = autoQuestion.ask();
		boolean claim3Months = threeMonthQuestion.ask();

		Claim claim = new Claim(homeClaim, autoClaim, claim3Months);
		System.out.println(claim);
	}

}
