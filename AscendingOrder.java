package com.bridgelabz;

public class AscendingOrder {
public static void main(String[] args) {
	int arr[]=new int[] {9,8,5,7,6,3,5,1};
	int temp=0;
   
	System.out.println("Elements of Original array");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i] +"\n");
    }
    for (int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if (arr[i]>arr[j]) 
    		{
    			temp=arr[i];
    			arr[i]=arr[j];  
                arr[j]=temp;   		
    		}
    	}
    }
    System.out.println("Elements of Ascending array");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i] +" ");
    }
  ////  /////////////////////////////////////////////////////////
    for (int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if (arr[i]<arr[j]) 
    		{
    			temp=arr[i];
    			arr[i]=arr[j];  
                arr[j]=temp;   		
    		}
    	}
    }
    System.out.println("Elements of Descending array");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i] +" ");
    }
}
}
