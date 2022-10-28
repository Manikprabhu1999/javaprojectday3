package com.bridgelabz;
import java.util.Scanner;
public class ReverseArray {
 public static void main(String[] args) {
	int a[]=new int[6];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Elements in Array");
		
	for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
//      System.out.println("Array Elements");
//		
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.println(a[i]+" ");
//  }
		System.out.println("Reverse Array Elements");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		
}
}
