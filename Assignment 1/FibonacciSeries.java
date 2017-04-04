package com.java.assignment;

import java.util.Scanner;

public class FibonacciSeries {
	void Fibonacci(){
		int i,n,c=0,s=1;
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a number");
		 n = sc.nextInt();
		 System.out.println("Fibonacci Series is"+c+ " "+s);
		 for(i=1; i<=n; i++){
			 int sum = c+s;
			 System.out.println(" "+sum);
			 c=s;
			 s=sum;
			 
		 }sc.close();
	}

}
