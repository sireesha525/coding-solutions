# VOLCONTROL - Rating 409

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Volume Control

Chef is watching TV. The current volume of the TV is $X$. Pressing the `volume up` button of the TV remote increases the volume by $1$ while pressing the `volume down` button decreases the volume by $1$. Chef wants to change the volume from $X$ to $Y$. Find the minimum number of button presses required to do so.

### Input Format
- The first line contains a single integer $T$ - the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two integers $X$ and $Y$ - the initial volume and final volume of the TV.
### Output Format

For each test case, output the minimum number of times Chef has to press a button to change the volume from $X$ to $Y$.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X, Y \leq 100$
### Sample 1:
Input
Output

```
2
50 54
12 10

```

```
4
2

```

### Explanation:

 **Test Case 1:**  Chef can press the `volume up` button $4$ times to increase the volume from $50$ to $54$.

 **Test Case 2:**  Chef can press the `volume down` button $2$ times to decrease the volume from $12$ to $10$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T23:39:47.066Z  

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
		    System.out.println(Math.abs(x-y));
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VOLCONTROL)