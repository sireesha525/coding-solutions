import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		// Check if there is an input for T
		if (sc.hasNextInt()) {
    		int t = sc.nextInt();
    		
    		while (t-- > 0) {
    		    int n = sc.nextInt();
    		    
    		    // Extract the last digit
    		    int lastDigit = n % 10;
    		    
    		    // Extract the first digit
    		    int firstDigit = n;
    		    while (firstDigit >= 10) {
    		        firstDigit /= 10;
    		    }
    		    
    		    // Print the sum of first and last digits
    		    System.out.println(firstDigit + lastDigit);
    		}
		}
		
		sc.close();
	}
}