package ClassBasics.caseStudy;
import ClassBasics.caseStudy.*;

public class main {

	public static void main(String[] args) {
		
		Questions q = new Questions();
		boolean homeClaim = q.isHomeClaim();
		boolean autoClaim = q.isAutoClaim();
		boolean claim3Months = q.claim3Months();
				
		Claim claim = new Claim(homeClaim, autoClaim, claim3Months);
		System.out.println(claim);
	}
}
