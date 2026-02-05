package PSTproject;

import java.util.Scanner;

public class Multiplicate_table {
	public static void main(String[] args) {
		Scanner pr = new Scanner(System.in);
		System.out.println("enter the num:");
		int p = pr.nextInt();
		for (int i = 1;i<=12;i++) {
		System.out.println(p +" x " + i + " = " + (p*i) );
	}

}
}

