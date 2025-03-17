package assigments;

import java.util.Scanner;

public class LoanEligibilty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Credit Score: (300-850)");
		int creditScore = sc.nextInt();
		
		System.out.println("Enter your Annual Income: (rs)");
		double income = sc.nextDouble();
		
		System.out.println("Do you have stable income: (yes/no)");
		Boolean job = sc.next().equalsIgnoreCase("yes");
		
		System.out.println("Enter your existing debt: (rs)");
		double debt = sc.nextDouble();
		if(job==true) {
		if(creditScore<=850 && creditScore>=300) {
			if(income>0) {
					if(creditScore<550 || income< 250000|| debt >400000) { // Basic Loan Requirments
					System.out.println("Loan Denied: Due to not meeting the Loan requirements");	
					}
					else {
					String loanCategory = (income>=500000)? "High Amount":
						(income>=300000)? "Moderate Loan Amount":"Small Amount";
					String interestRate = (creditScore>=750)? "Low Interest":(creditScore>=650)?"Standard Interest":
						"High interest";
					 System.out.println("Loan Approved: " + loanCategory + " with " + interestRate);
					}
				}else {
					System.out.println("Loan Denied due to 0 salary");
				}
			}
			
		}else {
			System.out.println("Loan Denied  due to no job");

		}
		sc.close();
		}
	}


