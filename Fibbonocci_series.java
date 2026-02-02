package PSTproject;

import java.util.Scanner;

public class Fibbonocci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		        int n = sc.nextInt();
		        int P = 0, R = 1;
		        System.out.println("Fibonacci Series up to " + n + " terms:");
		        for (int i = 0; i <= n; i++) {
		            System.out.print(P + " ");
		            int next = P + R;
		            P = R;
		            R = next;
		        }
		        sc.close();
		    }
	}


