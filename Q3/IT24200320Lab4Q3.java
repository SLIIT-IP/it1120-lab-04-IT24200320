import java.util.Scanner;

public class  IT24200320Lab4Q3{
	public static void main(String[] args) {
	
	int number;
	String result;

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	number = input.nextInt();
	
	result = (number>0)? "The number is positive" :
		 (number<0)? "The number is negative" : 
		 "The number is zero";

System.out.println(result);

	

	







	}
}