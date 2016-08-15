package test;

import java.util.Scanner;

import java.lang.ru;

public class scanner {
	 public static void main(String args[]){  	
	  Scanner sc=new Scanner(System.in);  
	     
	   System.out.println("Enter your rollno");  
	   String rollno=sc.nextInt();  
	   System.out.println("Enter your name");  
	   String name=sc.next();
	   
	   while(sc.hasNext())
	   {
		   if(sc.hasNext())
		   {
			   rollno=sc.next();
			   rollno++;
		   }
	   }
	   
}
}