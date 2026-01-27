import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp in c:");
        int c = sc.nextInt();
        
        double fre = (c*1.8)+32;
        System.out.print("F:" + fre);
    }
}
