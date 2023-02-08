package ClassBasics.caseStudy;

public class Claim {

	private String routeTo;
	private boolean homeClaim;
	private boolean autoClaim;
	private boolean claim3Months;

	public Claim(boolean homeClaim, boolean autoClaim, boolean claim3Months) {
		this.homeClaim = homeClaim;
		this.autoClaim = autoClaim;
		this.claim3Months = claim3Months;
		
		String routeTo;
		if (claim3Months) {
			routeTo = "fraud investigation";
		}
		else if (homeClaim) {
			routeTo = "home claims";
		}
		else {
			routeTo = "auto claims";
		}
		this.routeTo = routeTo;
	}
	
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public boolean isHomeClaim() {
		return homeClaim;
	}
	public void setHomeClaim(boolean homeClaim) {
		this.homeClaim = homeClaim;
	}
	public boolean isAutoClaim() {
		return autoClaim;
	}
	public void setAutoClaim(boolean autoClaim) {
		this.autoClaim = autoClaim;
	}
	public boolean isClaim3Months() {
		return claim3Months;
	}
	public void setClaim3Months(boolean claim3Months) {
		this.claim3Months = claim3Months;
	}
	
	public String toString() {
		return "claim being routed to " + this.routeTo;
	}
}
