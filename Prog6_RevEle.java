package com.Arrays2;

import java.util.Arrays;

public class Prog6_RevEle 
{
	public static void main(String[] args) {
		int arr[]= {123,423,12,19,456};
		  isRev(arr);
	}
  public static void isRev(int[] a) 
  {
	  int c[]=new int[a.length];
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		int rev=0;
		int temp=a[i];    //123
		while(temp>0)
		{
		   int rem=temp%10;   //rem=2
		   rev=rev*10+rem;     //rev=32
		   temp/=10;         //1
		}
		c[i]=rev;
	}
	System.out.println(Arrays.toString(c));
  }
  
}
