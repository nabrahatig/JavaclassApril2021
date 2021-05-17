package question5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//Write a program that validates a phone number input,  make sure the length of the input is 10 digits
		//valid phone number
		//invalid phone number(too long)
		//invalid phone number (too short)
		
	
		long myphoneNumber=10;
	    int a[]=new int[9]; 
            Scanner sc=new Scanner(System.in);
	    System.out.println("a good valid phonephone number");
	    for(int i=0;i<myphoneNumber;i++)
	    {
          
	      a[i]=sc.nextInt();
              if(a[i]<0 || a[i]>9)
		{
                 
		System.out.print("invalid myphonenumber is long ");
		return;
		}
		
		System.out.println("");
 
            }  
	    
		System.out.print("invalid phone number is short");
	    for(int i=0;i<myphoneNumber;i++)
	    {
	    if(i==0)
		System.out.print("\"(");
               if(i<12)
		System.out.print(") ");
		
	      if(i<1);
		System.out.print("-");
		
		System.out.print(a[i]);
		
	      if(i==9);
		}
	  	}

		
         
  

	}


