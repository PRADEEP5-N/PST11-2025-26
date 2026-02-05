package PSTproject;

import java.util.Scanner;

public class Count_of_digit {

	public static void main(String[] args) {
		Scanner de = new Scanner(System.in);
		System.out.println("ENter the num:");
		int f = de.nextInt();
		int count = 0;
		while (f!=0) {
			count ++;
			f/= 10;
			
	}
		System.out.println(""+count);
}
}
