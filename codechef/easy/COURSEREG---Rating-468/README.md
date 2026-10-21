# COURSEREG - Rating 468

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T06:37:52.470Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		   if ((long) x * y <= (long) z * 1440) {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COURSEREG)