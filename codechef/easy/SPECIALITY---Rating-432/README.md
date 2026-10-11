# SPECIALITY - Rating 432

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T09:52:46.037Z  

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
		    int disposableTotalCost = x * 100;
		    int clothTotalCost = y * 10;
		    
		    // If cloth mask cost is less than or equal to disposable mask cost, choose CLOTH
		    // (handles ties by preferring cloth as per the problem description)
		    if (clothTotalCost <= disposableTotalCost) {
		        System.out.println("CLOTH");
		    }
		    else{
		        System.out.println("DISPOSABLE");
		    }
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SPECIALITY)