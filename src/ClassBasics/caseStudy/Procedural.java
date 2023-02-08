package ClassBasics.caseStudy;

import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("is this a home insurace claim? (y/n)");
		String response = keyboard.nextLine();
		boolean homeClaim = response.equals("y");
		
		System.out.println("is this an auto insurace claim? (y/n)");
		response = keyboard.nextLine();
		boolean autoClaim = response.equals("y");
		
		System.out.println("was a claim made in the last 3 months? (y/n)");
		response = keyboard.nextLine();
		boolean claim3Months = response.equals("y");
		
		// if-else decision logic
//		String routeTo;
//		if (claim3Months) {
//			routeTo = "fraud investigation";
//		}
//		else if (homeClaim) {
//			routeTo = "home claims";
//		}
//		else {
//			routeTo = "auto claims";
//		}
		
		// hardcore 1-liner
		String routeTo = claim3Months ? "fraud investigation" : (((autoClaim && homeClaim) || !autoClaim) ? "home" : "auto");
				
		System.out.println("Claim details:");
		System.out.printf("home claim: %s\n", homeClaim);
		System.out.printf("auto claim: %s\n", autoClaim);
		System.out.printf("claim in last 3 months: %s\n", claim3Months);
		System.out.printf("route to %s\n", routeTo);
	}

}
