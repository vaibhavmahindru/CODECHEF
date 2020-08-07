/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0; i<t ;i++)
		{
		    int l = in.nextInt();
		    in.nextLine();
		    String s = in.nextLine();
		    int count = 0;
		    
		        for(int j=0; j<l; j++)
		        {
		            count = 0;
		            for(int k=0; k<l; k++)
		            {
		                if(s.charAt(j) == s.charAt(k)) count++;
		            }
		            if(!((count%2)==0)){
		                System.out.println("NO");
		                break;
		            }
		            else{
		                count = -1;
		            }
		           
		        }
		        if(count == -1){
		        System.out.println("YES");
		        }
		    
		}
	}
}
