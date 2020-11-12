/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] reverseElements(int[] arr){
        
       for(int i = 0 , j = arr.length-1 ; i < j ; i++ , j--){
           int temp;
           temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
       }
     return arr;  
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {10,20,30,40};
		
		for(int i: Codechef.reverseElements(arr)){
		    System.out.println(i);
		}
	}
}
