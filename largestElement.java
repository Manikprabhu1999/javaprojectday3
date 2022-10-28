package com.bridgelabz;

import java.util.Scanner;
public class largestElement {
public static void main(String[] args) {
	int []a=new int [5]; int max;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter array Elements");
	
	for (int i=0;i<5;i++)
	{
		a[i]=scanner.nextInt();
	}
	max=a[0];
	for (int i=1;i<5;i++)
		
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Largest Element is:"+max);
	
}
}
