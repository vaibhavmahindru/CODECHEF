/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    for(int i = 0; i<t; i++){
	        int n = in.nextInt();
	        int num = 1;
	        for(int j = 0; j<n; j++){
	            int a = in.nextInt();
	            num *= a;
	        }
	        if((num%2) == 0) System.out.println("NO");
	        else System.out.println("YES");
	    }
	}
}
