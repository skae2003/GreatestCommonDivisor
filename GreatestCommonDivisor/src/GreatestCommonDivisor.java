import java.util.*;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		
		Scanner num = new Scanner(System.in);
		
		int num1 = num.nextInt();
		
		System.out.println("Please enter another number: ");
		
		int num2 = num.nextInt();
		
		int count= 2;
		
		int gcd = 0;
		
		while(count <= num1 && count <= num2) {
			
			if ((num1 % count == 0) && (num2 % count == 0)) {
				
				gcd = count;
				
			}
			
			++count;
			
		}
		
		System.out.println(gcd + " is the greatest common divisor");
		

	}

}
