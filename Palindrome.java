package PST;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the palindrome:");
    String word=sc.nextLine();
    String rev="";
    for(int i=word.length()-1;i>=0;i--) {
       rev+=word.charAt(i);
    }
    System.out.println(rev);
	
   if(rev==word) {
	   System.out.print("this statement is:" + true);
   }else {
	   System.out.println("this statement is:" + false);
   }
}
}