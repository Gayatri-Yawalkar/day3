package com.bridgelabz.employeewage;
//UC5
public class EmpWageWagesForMonth {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHour=20;
	public static final int numOfWorkingDays=20;
	public static void main(String[] args) {
		int empHrs=0,dailyempWage=0,totalEmpWage=0;
		for(int day=0;day<numOfWorkingDays;day++) {
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
				case isPartTime:
					empHrs=4;
					break;
				case isFullTime:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			dailyempWage=(empHrs*empRatePerHour);
			System.out.println("Daily Employee Wage="+dailyempWage);
			totalEmpWage+=dailyempWage;
		}
		System.out.println("Total Employee Wage="+totalEmpWage);
	}
}
