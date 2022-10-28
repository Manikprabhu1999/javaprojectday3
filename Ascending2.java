package com.bridgelabz;
import java.util.Scanner;
public class Ascending2 {
	public static void main(String[] args) {
		int a[]=new int[5];int temp=0;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter Elements to be Sorted");
		for(int i=0;i<5;i++)
		{
			a[i]=ref.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++) 
			{
				if (a[i]>a[j])
				{
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				}
			}
		}	
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}