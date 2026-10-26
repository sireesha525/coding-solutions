import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int R1=sc.nextInt();
		    int R2=sc.nextInt();
		    int R3=sc.nextInt();
		    if(R1>R2+R3 || R2>R1+R3 || R3>R1+R2){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("No");
		    }
		}

	}
}
