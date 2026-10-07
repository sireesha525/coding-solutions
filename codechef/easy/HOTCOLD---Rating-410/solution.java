import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		// X is the withdrawal amount, Y is the initial balance
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		// Check if the withdrawal amount is a multiple of 5 
		// and if there is enough balance to cover the amount plus the 0.50 charge
		if (x % 5 == 0 && y >= x + 0.50) {
		    y -= (x + 0.50);
		}
		
		// Print the final balance with exactly 2 decimal places
		System.out.printf("%.2f\n", y);
	}
}