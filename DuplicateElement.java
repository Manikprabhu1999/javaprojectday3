package com.bridgelabz;
public class DuplicateElement {
public static void main(String[] args) {
	int[] arr= {5,2255,54,2255,6,8,25,36,5,65,65};
	for(int i=0 ;i<arr.length ;i++)
	{
		for(int j=i+1 ;j<arr.length ;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("The Duplicate Element is:"+arr[j]);
			}
		}
	}	
}
}