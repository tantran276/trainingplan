package vn.com.tma.trainingplan.designpattern.factory;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equals("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if(planType.equals("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if(planType.equals("INSITUTIONALPLAN")) {
			return new InsitutionalPlan();
		}
		return null;
	}
}
