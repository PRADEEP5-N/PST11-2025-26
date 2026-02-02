package PSTproject;

import java.util.Scanner;

public class Leap_yr {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the leap yr:");
		int yr = ob.nextInt();
		if(yr%400==0 || yr%4==0 && yr%100!=0) {
			System.out.println("It is a leap yr");
		}
		else {
			System.out.println("It is not leap yr");
		}
		

	}

}
