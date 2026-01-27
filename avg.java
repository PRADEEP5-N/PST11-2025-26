import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark1:");
        int mark1 = sc.nextInt();
        System.out.print("enter the mark2:");
        int mark2 = sc.nextInt();
        System.out.print("enter the mark3:");
        int mark3 = sc.nextInt();
        int Avg = (mark1 + mark2 + mark3) / 3;
        System.out.print("Avg:" + Avg);
    }
}
