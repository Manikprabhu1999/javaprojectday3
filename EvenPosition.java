package com.bridgelabz;

public class EvenPosition {
public static void main(String[] args) {
	int arr[]=new int[]{1,2,3,4,5,6,7,8,9,};
	
	System.out.println("ENTER THE NUMBERS");
	
	for (int i=2;i<arr.length;i=i+2)
	{
		System.out.println("Position="+i);
		System.out.println("Value="+arr[i]);
	}
}
}
