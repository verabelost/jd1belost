package test;

import java.util.Scanner;

public class Task13Solution {

	public static void main(String[] args) {
		 

	        { 
		      double x=0;		      

	          boolean bool = true;	          

	          Scanner sc=new Scanner (System.in);

	          while (bool==true)

	           {

	            if (sc.hasNextDouble())

	             {
	            	x = sc.nextDouble();
	            	bool = false;
	             }

	            else
	             {
	            	System.out.println("Вы ввели не число" );
	            	sc.next();
	            	continue;
	             }

	           }
	          if (x<=3){
	        	  x=(Math.pow(x, 2))+(3*x)+9;
	          }
	          else{
	        	  x=(Math.sin(x))/(Math.pow(x, 2)-9);
	              }	
	          System.out.println(x); 
	          }
	   
}
	
	}