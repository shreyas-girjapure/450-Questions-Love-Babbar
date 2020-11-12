

import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] reverseElements(int[] arr,int start , int end){
        int temp;    
       if(start>=end){
        return null; 
       }
       temp = arr[end];
       arr[end] = arr[start];
       arr[start] = temp;
       reverseElements(arr,start+1,end-1);
       return arr;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {10,20,30,40};
		
		for(int i: Codechef.reverseElements(arr,0,arr.length-1)){
		    System.out.println(i);
		}
	}
}
