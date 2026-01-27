package PST;

public class Element_oddOreven {
	public static void main(String[] args) {
		 int number[]= {10,20,30,40,67};
	     int count = number.length;
        System.out.println("total element:" + count);
        for (int i = 0; i <count; i++) {
            if (number[i] % 2 == 0) {
            	 System.out.println(number[i] + " is even");
             }
               else{
                System.out.println(number[i] + " is Odd");
            }
	    }
     }
}
  