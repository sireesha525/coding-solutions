# TFPAPER - Rating 395

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T23:07:33.215Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    if(x<=3){
		        System.out.println("BRONZE");
		    }
		    else if(x<=6){
		        System.out.println("SILVER");
		    }
		    else{
		        System.out.println("GOLD");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TFPAPER)