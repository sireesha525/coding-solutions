import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            while (n != 0) {
                int d = n % 10; // Extract the last digit
                sum += d;       // Add it to the sum
                n /= 10;        // Remove the last digit
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}