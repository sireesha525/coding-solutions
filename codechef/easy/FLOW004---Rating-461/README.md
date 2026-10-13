# FLOW004 - Rating 461

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### First and Last Digit

Given an integer  **N** . Write a program to obtain the sum of the first and last digits of this number.

### Input Format

The first line contains an integer  **T**, the total number of test cases. Then follow  **T**  lines, each line contains an integer  **N**.

### Output Format

For each test case, display the sum of first and last digits of  **N**  in a new line.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 1000000$
### Sample 1:
Input
Output

```
3 
1234
124894
242323

```

```
5
5
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T16:02:41.714Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW004)