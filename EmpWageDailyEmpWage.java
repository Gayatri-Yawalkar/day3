package com.bridgelabz.employeewage;
//UC2
public class EmpWageDailyEmpWage {
	public static void main(String[] args) {
		int is_full_time = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (is_full_time == empCheck) {
			int empRatePerHour=20;
			int empHrs=8;
			double dailyEmpWage=(empHrs*empRatePerHour);
			System.out.println("Daily Employee Wage if Employee is Present="+dailyEmpWage);
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
