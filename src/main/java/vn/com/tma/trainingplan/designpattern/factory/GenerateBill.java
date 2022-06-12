package vn.com.tma.trainingplan.designpattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	public static void main(String[] args) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which the bill will be generated:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the number of units for bill will be caculated:");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("Bill for " + planName + " of " + units + " units is: ");
		p.getRate();
		p.caculateBill(units);
	}
}
